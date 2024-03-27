package com.example.demo.controller;

import com.example.demo.entity.banners;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bannercontroller {
    @GetMapping("/banner")
    public banners banner(){
        banners bns = new banners();
        return bns;
    }
}
