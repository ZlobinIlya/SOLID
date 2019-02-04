package com.epam.ocprinciple;

public class Demo {
    public static void main(String[] args) {
        Car car = new Celeca();
        workInPassanger(car);
    }

    private static void workInPassanger(Car car) {
        car.workInTaxi();
    }
}
