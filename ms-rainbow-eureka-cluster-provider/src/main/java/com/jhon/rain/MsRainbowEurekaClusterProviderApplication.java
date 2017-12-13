package com.jhon.rain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsRainbowEurekaClusterProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRainbowEurekaClusterProviderApplication.class, args);
	}
}
