package com.example.spring_cloud_discovery_client;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<String> test (){
        return new ResponseEntity<>( "First client test",HttpStatus.OK);
    }
}
