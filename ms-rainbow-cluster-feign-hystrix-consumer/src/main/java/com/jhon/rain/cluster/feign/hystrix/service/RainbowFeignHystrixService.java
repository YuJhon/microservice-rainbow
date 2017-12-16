package com.jhon.rain.cluster.feign.hystrix.service;

import com.jhon.rain.cluster.feign.hystrix.service.impl.RainbowFeignHystrixErrorServiceImpl;
import com.jhon.rain.model.RainbowDemoVO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <p>功能描述</br>业务逻辑定义接口</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName ms-rainbow
 * @date 2017/12/14 21:55
 */
@FeignClient(value = "cluster-provider-service",fallback = RainbowFeignHystrixErrorServiceImpl.class)
public interface RainbowFeignHystrixService {
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
