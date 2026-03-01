package com.mashibing.strategy.filter.impl;

import com.mashibing.common.model.StandardSubmit;
import com.mashibing.strategy.filter.StrategyFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 号段补全：获取手机号的运营商以及对应的归属地
 * @author zjw
 * @description
 */
@Service(value = "phase")
@Slf4j
public class PhaseStrategyFilter implements StrategyFilter {

    @Override
    public void strategy(StandardSubmit submit) {
        log.info("【策略模块-号段补齐】   校验ing…………");
    }
}
