package com.mashibing.api.filter;

import com.mashibing.api.form.SmsForm;

/**
 *
 * @author zjw
 * @description 做策略模式的父接口
 */
public interface CheckFilter {

    /**
     * 校验！！！！
     * @param smsForm
     */
    void check(SmsForm smsForm);
}
