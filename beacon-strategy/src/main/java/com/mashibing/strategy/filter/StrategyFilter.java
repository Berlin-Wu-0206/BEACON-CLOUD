package com.mashibing.strategy.filter;

import com.mashibing.common.model.StandardSubmit;

/**
 * @author Berlin
 * @description
 */
public interface StrategyFilter {

    /**
     * 校验！！！！
     * @param submit
     */
    void strategy(StandardSubmit submit);
}
