package com.jhon.rain.cluster.feign.consumer.controller;

import com.jhon.rain.cluster.feign.consumer.service.RainbowProviderFeignClient;
import com.jhon.rain.model.RainbowDemoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>功能描述</br> 控制器 </p>
 *
 * @projectName ms-rainbow
 * @author jiangy19
 * @date 2017/12/13 21:48
 * @version v1.0
 */
@RestController
public class RainbowFeignController {

  @Autowired
  RainbowProviderFeignClient client;

  @GetMapping("/consumerGetWay")
  public String getMethodTest() {
    return client.getMethod();
  }

  @PostMapping("/consumerPostWay")
  public String postMethodTest(@RequestBody RainbowDemoVO rainbowVO) {
    return client.postMethod(rainbowVO);
  }
}
