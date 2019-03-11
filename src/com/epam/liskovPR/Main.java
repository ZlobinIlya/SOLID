package com.epam.liskovPR;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = getRectangle();
        rectangle.setHeight(10);
        rectangle.setWith(5);
        System.out.println(rectangle.getSquere());
    }

    private static Shape getRectangle() {
        return new Square();
    }
}
