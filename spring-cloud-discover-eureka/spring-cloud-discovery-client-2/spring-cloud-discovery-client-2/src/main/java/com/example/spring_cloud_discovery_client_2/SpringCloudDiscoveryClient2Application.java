package com.example.spring_cloud_discovery_client_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.spring_cloud_discovery_client_2")
public class SpringCloudDiscoveryClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDiscoveryClient2Application.class, args);
	}

}
