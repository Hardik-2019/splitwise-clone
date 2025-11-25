package com.user_service.user_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String sayhello(){
        return "hello jaswanth";
    }
    @GetMapping("/test")
    public String test(){
        return "Gateway done";
    }
}
