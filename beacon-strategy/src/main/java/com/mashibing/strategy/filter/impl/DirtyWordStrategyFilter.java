package com.mashibing.strategy.filter.impl;

import com.mashibing.common.model.StandardSubmit;
import com.mashibing.strategy.filter.StrategyFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 敏感词校验
 * @author zjw
 * @description
 */
@Service(value = "dirtyword")
@Slf4j
public class DirtyWordStrategyFilter implements StrategyFilter {
    @Override
    public void strategy(StandardSubmit submit) {
        log.info("【策略模块-敏感词校验】   校验ing…………");
    }
}
