package com.epam.liskovPR;

public class Square implements Shape {
    int widh;


    @Override
    public int getSquere() {
        return widh*widh;
    }

    @Override
    public void setHeight(int ed) {

    }

    @Override
    public void setWith(int widh) {
        this.widh = widh;
    }
}
