package com.mashibing.api.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 发送短信必备的参数
 * @author zjw
 * @description
 */
@Data
public class SmsForm {

    /** 客户的apikey */
    @NotBlank(message = "apikey不允许为空！")
    private String apikey;

    /** 手机号 */
    @NotBlank(message = "手机号不能为空！")
    private String mobile;

    /** 客户业务内的uid */
    private String uid;
}
