package com.jhon.rain.cluster.ribbon.hystrix.amqp.controller;

import com.jhon.rain.cluster.ribbon.hystrix.amqp.service.RainbowClusterRibbonHystrixAmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>功能描述</br></p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName ms-rainbow
 * @date 2017/12/21 15:12
 */
@RestController
public class RainbowClusterRibbonHystrixAmqpController {

  @Autowired
  private RainbowClusterRibbonHystrixAmqpService rainbowClusterRibbonHystrixAmqpService;

  @RequestMapping("/errorAmqpConsumer")
  public String errorAmqpCustomer() {
    return rainbowClusterRibbonHystrixAmqpService.notNormalConsumerService();
  }

  @RequestMapping("/normalAmqpConsumer")
  public String normalAmqpCustomer() {
    return rainbowClusterRibbonHystrixAmqpService.normalConsumerService();
  }
}
