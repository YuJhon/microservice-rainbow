package com.jhon.rain.cluster.ribbon.hystrix.amqp.service;

/**
 * <p>功能描述</br></p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName ms-rainbow
 * @date 2017/12/21 15:13
 */
public interface RainbowClusterRibbonHystrixAmqpService {
  /**
   * <pre>不正常的接口测试</pre>
   *
   * @return
   */
  String notNormalConsumerService();

  /**
   * <pre>正常的接口测试</pre>
   *
   * @return
   */
  String normalConsumerService();
}
