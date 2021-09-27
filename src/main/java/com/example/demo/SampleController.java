package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController
{
    @GetMapping("/")
    public String test()
    {
        return "SUCCESS";
    }
}
