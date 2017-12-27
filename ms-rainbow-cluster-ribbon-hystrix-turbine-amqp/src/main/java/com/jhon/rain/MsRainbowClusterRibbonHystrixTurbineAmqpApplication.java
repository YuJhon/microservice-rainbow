package com.jhon.rain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.context.annotation.Configuration;

@EnableTurbineStream
@EnableDiscoveryClient
@SpringBootApplication
public class MsRainbowClusterRibbonHystrixTurbineAmqpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRainbowClusterRibbonHystrixTurbineAmqpApplication.class, args);
	}
}
