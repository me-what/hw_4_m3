package com.example.hw_4_m3.model;

import java.io.Serializable;

public class Flower implements Serializable {
    String name;
    int sum;
    String color;
    int image;

    public Flower(String name, int sum, String color, int image) {
        this.name = name;
        this.color = color;
        this.sum = sum;
        this.image = image;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getSum() {
        return this.sum;
    }

    public int getImage() {
        return this.image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
