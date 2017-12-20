package com.jhon.rain.cluster.ribbon.hystrix.controller;

import com.jhon.rain.cluster.ribbon.hystrix.service.RainbowClusterRibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>功能描述</br>Ribbon方式的Hystrix测试控制器</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName ms-rainbow
 * @date 2017/12/14 21:38
 */
@RestController
public class RainbowClusterRibbonHystrixController {

  @Autowired
  private RainbowClusterRibbonHystrixService rainbowClusterRibbonHystrixService;

  @RequestMapping("/errorConsumer")
  public String errorCustomer() {
    return rainbowClusterRibbonHystrixService.notNormalConsumerService();
  }

  @RequestMapping("/normalConsumer")
  public String normalCustomer() {
    return rainbowClusterRibbonHystrixService.normalConsumerService();
  }
}
