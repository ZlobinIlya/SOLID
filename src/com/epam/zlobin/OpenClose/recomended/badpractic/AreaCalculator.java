package com.epam.zlobin.OpenClose.recomended.badpractic;

public class AreaCalculator{
    public double calculateRectangleArea(Rectangle rectangle){
        return rectangle.length *rectangle.width;
    }
    public double calculateCircleArea(Circle circle){
        return circle.radius*circle.radius;
    }
}