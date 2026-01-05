package com.mashibing.api.filter;

/**
 *
 * @author zjw
 * @description 做策略模式的父接口
 */
public interface CheckFilter {

    /**
     * 校验！！！！
     * @param object
     */
    void check(Object object);
}
