package com.example.springsecurityjwt.controller;

import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HomeController {

    @GetMapping("/homepage")
    public String userHomepage(Authentication authentication) {
        var user = authentication.getPrincipal();
        return "hello "+authentication.getName();
    }


}
