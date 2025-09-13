package com.example.spring_cloud_discovery_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudDiscoveryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDiscoveryClientApplication.class, args);
	}

}
