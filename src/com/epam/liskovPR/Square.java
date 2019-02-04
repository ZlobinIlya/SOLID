package com.epam.liskovPR;

public class Square implements Shape {
    int widh;

    public int getWidh() {
        return widh;
    }

    public void setWidh(int widh) {
        this.widh = widh;
    }

    @Override
    public int getSquere() {
        return widh^2;
    }
}
