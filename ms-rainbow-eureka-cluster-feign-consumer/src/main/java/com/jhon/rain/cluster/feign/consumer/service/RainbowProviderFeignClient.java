package com.jhon.rain.cluster.feign.consumer.service;

import com.jhon.rain.model.RainbowDemoVO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <p>功能描述</br> Feign接口申明 </p>
 *
 * @projectName ms-rainbow
 * @author jiangy19
 * @date 2017/12/13 21:50
 * @version v1.0
 */
@FeignClient("cluster-provider-service")
public interface RainbowProviderFeignClient {

  /**
   * <pre>测试Get方法调用</pre>
   * @return
   */
  @GetMapping("/provider")
  String getMethod();

  /**
   * <pre>测试Post方法调用</pre>
   * @param rainbowVO
   * @return
   */
  @PostMapping("/postIndex")
  String postMethod(@RequestBody RainbowDemoVO rainbowVO);
}
