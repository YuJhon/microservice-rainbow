package com.jhon.rain.cluster.ribbon.hystrix.amqp.service.impl;

import com.jhon.rain.cluster.ribbon.hystrix.amqp.service.RainbowClusterRibbonHystrixAmqpService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * <p>功能描述</br></p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName ms-rainbow
 * @date 2017/12/21 15:13
 */
@Service
public class RainbowClusterRibbonHystrixAmqpServiceImpl implements RainbowClusterRibbonHystrixAmqpService {

  @Autowired
  private RestTemplate restTemplate;

  @Override
  @HystrixCommand(fallbackMethod = "consumerError")
  public String notNormalConsumerService() {
    String providerMsg = restTemplate.
            getForEntity("http://CLUSTER-PROVIDER-SERVICE/provider", String.class).getBody();
    return "MSG FROM Rainbow Provider : <br/>" + providerMsg;
  }

  @Override
  @HystrixCommand(fallbackMethod = "consumerError")
  public String normalConsumerService() {
    String providerMsg = restTemplate.
            getForEntity("http://CLUSTER-PROVIDER-SERVICE/normalProvider", String.class).getBody();
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
