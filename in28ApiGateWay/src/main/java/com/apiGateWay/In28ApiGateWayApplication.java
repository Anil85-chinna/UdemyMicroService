package com.apiGateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class In28ApiGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(In28ApiGateWayApplication.class, args);
	}

}
