package com.mashibing.api.form;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author zjw
 * @description
 */
@Data
public class SingleSendForm extends SmsForm {


    /** 短信内容 */
    @NotBlank(message = "短信内容不能为空！")
    private String text;

    /** 0-验证码短信 1-通知类短信 2-营销类短信 */
    @Range(min = 0,max = 2,message = "短信类型只能是0~2的整数！")
    @NotNull(message = "短信类型不允许非空！")
    private Integer state;

}
