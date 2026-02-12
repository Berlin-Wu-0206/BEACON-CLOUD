package com.mashibing.common.util;

import com.mashibing.common.enums.ExceptionEnums;
import com.mashibing.common.exception.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * 雪花算法生成全局唯一ID
 * 64个bit为的long类型的值
 * 第一位：占1个bit位，就是0.
 * 第二位：占41个bit位，代表时间戳
 * 第三位：占5个bit位，代表机器id
 * 第四位：占5个bit位，服务id
 * 第五位：占12个bit位，序列，自增的数值
 * @author zjw
 * @description
 */
@Component
@Slf4j
public class SnowFlakeUtil {

    /**
     * 41个bit位存储时间戳，从0开始计算，最多可以存储69.7年。
     * 那么如果默认使用，从1970年到现在，最多可以用到2039年左右。
     * 按照从2022-11-11号开始计算，存储41个bit为，这样最多可以使用到2092年不到~~
     */
    private long timeStart = 1668096000000L;

    /**
     * 机器id
     */
    @Value("${snowflake.machineId:0}")
    private long machineId;

    /**
     * 服务id
     */
    @Value("${snowflake.serviceId:0}")
    private long serviceId;

    /**
     * 序列
     */
    private long sequence;


    /**
     * 机器id占用的bit位数
     */
    private long machineIdBits = 5L;

    /**
     * 服务id占用的bit位数
     */
    private long serviceIdBits = 5L;

    /**
     * 序列占用的bit位数
     */
    private long sequenceBits = 12L;

    /**
     * 计算出机器id的最大值
     */
    private long maxMachineId = -1 ^ (-1 << machineIdBits);

    /**
     * 计算出服务id的最大值
     */
    private long maxServiceId = -1 ^ (-1 << serviceIdBits);

    @PostConstruct
    public void init(){
        if(machineId > maxMachineId || serviceId > maxServiceId){
            System.out.println("机器ID或服务ID超过最大范围值！！");
            throw new ApiException(ExceptionEnums.SNOWFLAKE_OUT_OF_RANGE);
        }
    }

    /**
     * 服务id需要位移的位数
     */
    private long serviceIdShift = sequenceBits;

    /**
     * 机器id需要位移的位数
     */
    private long machineIdShift = sequenceBits + serviceIdBits;

    /**
     * 时间戳需要位移的位数
     */
    private long timestampShift = sequenceBits + serviceIdBits + maxMachineId;











}
