package com.jhon.rain.cluster.ribbon.hystrix.service.impl;

import com.jhon.rain.cluster.ribbon.hystrix.service.RainbowClusterRibbonHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * <p>功能描述</br>服务的实现类</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName ms-rainbow
 * @date 2017/12/14 21:42
 */
@Service
public class RainbowClusterRibbonHystrixServiceImpl
        implements RainbowClusterRibbonHystrixService {

  @Autowired
  private RestTemplate restTemplate;

  @Override
  @HystrixCommand(fallbackMethod = "consumerError")
  public String consumerService() {
    String providerMsg = restTemplate.
            getForEntity("http://CLUSTER-PROVIDER-SERVICE/provider", String.class).getBody();
    return "MSG FROM Rainbow Provider : <br/>" + providerMsg;
  }

  /**
   * <pre>错误处理方法</pre>
   * @return
   */
  public String consumerError() {
    return "sorry,ribbon call consumer provider service error!";
  }
}
