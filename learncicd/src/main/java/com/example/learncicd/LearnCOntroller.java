package com.example.learncicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnCOntroller {

    @GetMapping("/")
    public String home(){
        return "hello home";
    }
    
}
