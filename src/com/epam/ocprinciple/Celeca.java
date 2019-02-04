package com.epam.ocprinciple;

public class Celeca extends Toyota {
    @Override
    public void workInTaxi() {
        getPassangers();
    }

    void getPassangers() {
        System.out.println("get one passanger!");
    }
}
