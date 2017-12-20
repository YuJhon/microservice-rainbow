package com.jhon.rain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableTurbine
@EnableDiscoveryClient
public class MsRainbowClusterRibbonHystrixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRainbowClusterRibbonHystrixTurbineApplication.class, args);
	}
}
