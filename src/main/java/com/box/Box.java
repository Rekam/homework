package com.box;

public class Box {
    float length;
    float width;
    int height;
    // alt+insert   select constructor
    public Box(float length, float width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(float length, float width, int height) {
        if (this.length >= length && this.width >= width && this.height >= height) {
            return true;
        } else return false;
    }

}
