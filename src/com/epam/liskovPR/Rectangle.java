package com.epam.liskovPR;

public class Rectangle implements Shape{
    int with;
    int height;

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getSquere(){
        return with*height;
    }

}
