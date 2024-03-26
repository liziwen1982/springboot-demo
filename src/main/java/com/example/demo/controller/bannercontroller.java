package com.example.demo.controller;

import com.example.demo.entity.banner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bannercontroller {
    @GetMapping("/banner")
    public banner banner(){
        banner bn = new banner();
        return bn;
    }
}
