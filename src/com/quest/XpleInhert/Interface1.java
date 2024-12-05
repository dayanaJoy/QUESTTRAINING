package com.quest.XpleInhert;

public interface Interface1 {
    void method1();
    void method2();

    default void method3() {
        System.out.println("method3");
    }
    static void method4() {
        System.out.println("static method4");
    }
}
