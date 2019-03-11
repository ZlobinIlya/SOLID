package com.epam.zlobin.OpenClose.recomended.good;

public class Rectangle implements Shape{
    double length;
    double width;
    public double calculateArea(){
        return length * width;
    }
}