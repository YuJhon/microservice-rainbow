package com.jhon.rain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 将自己也注册为client
 */
@EnableEurekaServer
@EnableEurekaClient
@SpringBootApplication
public class MsRainbowEurekaClusterServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRainbowEurekaClusterServerApplication.class, args);
	}
}
