package com.example.daniel.menufragmentproject.pojo;

public class Pet {
    private String name;
    private int avatar;
    private int rate;

    public Pet(String name, int avatar, int rate) {
        this.name = name;
        this.avatar = avatar;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}