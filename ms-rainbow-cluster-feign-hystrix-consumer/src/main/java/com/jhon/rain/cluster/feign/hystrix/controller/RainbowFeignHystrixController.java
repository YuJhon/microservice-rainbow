package com.jhon.rain.cluster.feign.hystrix.controller;

import com.jhon.rain.cluster.feign.hystrix.service.RainbowFeignHystrixService;
import com.jhon.rain.model.RainbowDemoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>功能描述</br></p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName ms-rainbow
 * @date 2017/12/14 21:54
 */
@RestController
public class RainbowFeignHystrixController {

  @Autowired
  RainbowFeignHystrixService client;

  @GetMapping("/consumerGetWay")
  public String getMethodTest() {
    return client.getMethod();
  }

  @PostMapping("/consumerPostWay")
  public String postMethodTest(@RequestBody RainbowDemoVO rainbowVO) {
    return client.postMethod(rainbowVO);
  }
}
