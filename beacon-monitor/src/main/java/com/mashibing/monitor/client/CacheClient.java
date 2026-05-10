package com.mashibing.monitor.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Set;

/**
 * @author 郑大仙丶
 * @version V1.0.0
 */
@FeignClient(value = "beacon-cache")
public interface CacheClient {

    @PostMapping(value = "/cache/keys/{pattern}")
    Set<String> keys(@PathVariable String pattern);
}
