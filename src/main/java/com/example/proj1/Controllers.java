package com.example.proj1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping("/test")
    public String getNew(){
        return "Hello";
    }
}
