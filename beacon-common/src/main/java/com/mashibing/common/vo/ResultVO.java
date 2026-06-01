package com.mashibing.common.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 响应前端数据的基本结构
 * @author zjw
 * @description
 */
@Data
@NoArgsConstructor
public class ResultVO {

    private Integer code;

    private String msg;

    private Object data;


    public ResultVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
