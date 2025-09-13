package com.example.spring_cloud_discovery_client_2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="spring-cloud-client-1")
public interface FeignTestClient {

    @GetMapping("/first/test")
    ResponseEntity<String> test();


}
