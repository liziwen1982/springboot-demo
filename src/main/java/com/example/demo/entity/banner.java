package com.example.demo.entity;

public class banner {
    private long id;
    private String pic;

    public banner() {
    }

    public banner(long id, String pic) {
        this.id = id;
        this.pic = pic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

}
