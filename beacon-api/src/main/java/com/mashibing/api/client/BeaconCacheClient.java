package com.mashibing.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

/**
 * @author zjw
 * @description
 */
@FeignClient(value = "beacon-cache")
public interface BeaconCacheClient {

    @GetMapping("/cache/hgetall/{key}")
    Map hGetAll(@PathVariable(value = "key")String key);

}
