package com.epam.lohc;

import javax.xml.transform.sax.SAXSource;

    class A {
    private int i;

    public int getI() {
        return i;
    }
}
 class B {
    void getI(){
        System.out.println(new A().getI() );
    }
 }