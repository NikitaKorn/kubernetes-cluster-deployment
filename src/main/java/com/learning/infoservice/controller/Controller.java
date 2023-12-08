package com.learning.infoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/info")
    public String info(){
        return "Hello from info service";
    }
}
