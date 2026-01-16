package com.mashibing.api.client;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zjw
 * @description
 */
@FeignClient(value = "beacon-cache")
public interface BeaconCacheClient {



}
