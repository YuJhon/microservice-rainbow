package com.jhon.rain.cluster.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jiangy19 on 2017/12/12.
 */
@RestController
@Slf4j
public class RainbowClusterProviderController {

  @Autowired
  private DiscoveryClient client;

  @Autowired
  private Registration registration;

  @RequestMapping("/provider")
  public String index(){
    /** ServiceInstance instance = client.getLocalServiceInstance(); **/
    ServiceInstance instance = serviceInstance();
    log.info("/hello,host:{},service_id:{}",instance.getHost(),instance.getServiceId());
    return "Hello Rainbow Spring Cloud!";
  }

  /**
   * <pre>获取当前服务的服务实例</pre>
   * @return
   */
  private ServiceInstance serviceInstance(){
    List<ServiceInstance> list = client.getInstances(registration.getServiceId());
    if (list != null && list.size()>0){
      return list.get(0);
    }
    return null;
  }
}
