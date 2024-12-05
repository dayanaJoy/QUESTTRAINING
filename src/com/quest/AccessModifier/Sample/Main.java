package com.quest.AccessModifier.Sample;

public class Main {
    public static void main(String[] args) {
        Test obj = new Test();

        obj.publicMethod();


        obj.protectedMethod();


        obj.defaultMethod();

        // Accessing private method is not possible.shows an error
         //obj.privateMethod();
        obj.accessprivate();
    }
}
