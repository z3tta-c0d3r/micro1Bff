package com.example.micro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class HelloPrivateController {
    @GetMapping("/first")
    String hellow() {
        return "Hello World Called in First Service PRIVATE";
    }
}
