package com.quest.XpleInhert;

public class Xple implements Interface1,Interface2{

    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void method3() {
        Interface1.super.method3();
    }
}
