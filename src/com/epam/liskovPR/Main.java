package com.epam.liskovPR;



public class Main {
    public static void main(String[] args) {
            Rectangle rectangle = getRectangle();
            rectangle.setHeight(10);
            rectangle.setWith(5);
        System.out.println(rectangle.getSquere());
    }

    private static Rectangle getRectangle() {
         return new Rectangle();
    }
}
