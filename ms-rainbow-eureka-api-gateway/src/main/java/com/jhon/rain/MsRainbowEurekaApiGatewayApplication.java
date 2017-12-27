package com.jhon.rain;

import com.jhon.rain.filter.MsRainbowAccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class MsRainbowEurekaApiGatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(MsRainbowEurekaApiGatewayApplication.class, args);
  }

  @Bean
  public MsRainbowAccessFilter accessFilter() {
    return new MsRainbowAccessFilter();
  }
}
