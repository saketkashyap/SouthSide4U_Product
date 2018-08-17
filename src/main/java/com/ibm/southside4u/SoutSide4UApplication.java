package com.ibm.southside4u;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SoutSide4UApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoutSide4UApplication.class, args);
	}
}
