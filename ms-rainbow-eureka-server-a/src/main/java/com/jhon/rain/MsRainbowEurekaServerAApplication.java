package com.jhon.rain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsRainbowEurekaServerAApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRainbowEurekaServerAApplication.class, args);
	}
}
