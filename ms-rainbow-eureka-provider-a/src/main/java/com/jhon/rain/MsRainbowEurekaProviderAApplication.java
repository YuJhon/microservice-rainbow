package com.jhon.rain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsRainbowEurekaProviderAApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRainbowEurekaProviderAApplication.class, args);
	}
}
