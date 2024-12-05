package com.quest.XpleInhert;

public interface Interface2 {
    void method1();
    void method2();

    default void method3() {
        System.out.println("method3");
    }
}
