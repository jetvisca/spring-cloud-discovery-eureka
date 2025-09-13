package com.example.spring_cloud_discovery_client_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class TestController {

    @Autowired
    private FeignTestClient feignClient;


    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return feignClient.test();
    }

}
