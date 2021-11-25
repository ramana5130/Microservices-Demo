package com.reddy.ms1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ms1")
public class SampleController {

    private RestTemplate rs = new RestTemplate();
    private String ms2URL = "http://localhost:8081/ms2/welcome";

    @GetMapping("/welcome")
    public String hello() {
        return "hello MS1";
    }

    @GetMapping("/from")
    public ResponseEntity<String> get(){
        ResponseEntity<String> response = rs.getForEntity(ms2URL, String.class);
        return response;
    }
}
