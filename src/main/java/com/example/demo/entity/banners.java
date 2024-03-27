package com.example.demo.entity;

public class banners {
    private banner []banners;
    private static final int count = 10;

    public banners() {
        System.out.println("11111");
        this.banners = new banner[count];
        System.out.println("22222");
    }

    public banners(banner[] banners) {
        this.banners = banners;
    }

    public banner[] getBanners() {
        return banners;
    }

    public void setBanners(banner[] banners) {
        this.banners = banners;
    }
}
