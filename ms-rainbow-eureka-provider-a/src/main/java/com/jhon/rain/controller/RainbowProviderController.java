package com.jhon.rain.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangy19 on 2017/12/3.
 */
@RestController
@Slf4j
public class RainbowProviderController {

  @Autowired
  private DiscoveryClient client;

  @GetMapping("/hello")
  public String index(){
    ServiceInstance instance = client.getLocalServiceInstance();
    log.info("/hello,host:{},service_id:{}",instance.getHost(),instance.getServiceId());
    return "Hello Rainbow Spring Cloud!";
  }
}
