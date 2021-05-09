package com.example.springboot.config.client.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentController {

    private Environment environment;

    private EnvironmentController(Environment environment){
        this.environment = environment;
    }

    @GetMapping("/env-details")
    public String environmentDetails(){
        return environment.toString();
    }
}
