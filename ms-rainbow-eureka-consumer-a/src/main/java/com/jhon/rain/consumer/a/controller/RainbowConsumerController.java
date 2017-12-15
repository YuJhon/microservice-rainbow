package com.jhon.rain.consumer.a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>功能描述</br></p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName ms-rainbow
 * @date 2017/12/14 21:20
 */
@RestController
public class RainbowConsumerController {
  @Autowired
  private RestTemplate restTemplate;

  @RequestMapping("/consumer")
  public String customer() {
    String providerMsg = restTemplate.getForEntity("http://SERVICE-PROVIDER-A/provider", String.class).getBody();

    return "MSG FROM Rainbow Provider : <br/>" + providerMsg;
  }
}
