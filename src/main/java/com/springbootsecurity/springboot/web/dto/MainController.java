package com.springbootsecurity.springboot.web.dto;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}