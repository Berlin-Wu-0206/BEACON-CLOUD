package com.mashibing.webmaster.client;

import org.springframework.cloud.openfeign.FeignClient;

import java.util.Map;

/**
 * @author zjw
 * @description
 */
@FeignClient(value = "beacon-search")
public interface SearchClient {

    Map<String,Object> findSmsByParameters(Map<String,Object> parameters);



}
