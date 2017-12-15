package com.jhon.rain.cluster.feign.hystrix.service.impl;

import com.jhon.rain.cluster.feign.hystrix.service.RainbowFeignHystrixService;
import com.jhon.rain.model.RainbowDemoVO;
import org.springframework.stereotype.Component;

/**
 * <p>功能描述</br></p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName ms-rainbow
 * @date 2017/12/14 21:58
 */
@Component
public class RainbowFeignHystrixErrorServiceImpl implements RainbowFeignHystrixService {

  @Override
  public String getMethod() {
    return "Sorry,Get Method Is Busy,Please Wait A Moment!";
  }

  @Override
  public String postMethod(RainbowDemoVO rainbowVO) {
    return "Sorry,Post Method Is Busy,Please Wait A Moment!{"+rainbowVO.toString()+"}";
  }
}
