package com.mashibing.strategy.filter.impl;

import com.mashibing.common.model.StandardSubmit;
import com.mashibing.strategy.filter.StrategyFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 路由策略，选择合适的运营商通道
 * @author zjw
 * @description
 */
@Service(value = "route")
@Slf4j
public class RouteStrategyFilter implements StrategyFilter {
    @Override
    public void strategy(StandardSubmit submit) {
        log.info("【策略模块-路由策略】   校验ing…………");
    }
}
