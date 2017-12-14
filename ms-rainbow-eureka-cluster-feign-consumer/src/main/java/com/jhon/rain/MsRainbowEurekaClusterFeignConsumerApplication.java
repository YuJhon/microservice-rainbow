package com.jhon.rain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * <p>功能描述</br> 主应用程序 </p>
 *
 * @projectName ms-rainbow
 * @author jiangy19
 * @date 2017/12/13 21:50
 * @version v1.0
 */

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MsRainbowEurekaClusterFeignConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRainbowEurekaClusterFeignConsumerApplication.class, args);
	}
}
