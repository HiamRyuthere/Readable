package com.readable.Readable.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthcheck {

    @GetMapping
    public String home(){
        return "WELCOME , READABLE IS RUNNING WITH SPRINGBOOT ";
    }

}
