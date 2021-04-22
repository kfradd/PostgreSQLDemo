package com.example.postgresqldemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class example {

    @RequestMapping("/")
    public String FirstPage() {
        return "We succeed. we are viewing our first page.";
    }
}