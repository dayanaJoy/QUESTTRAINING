package com.quest.oops.Inheritence;

public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void nameDisplay()   {
        String msg = String.format("%s is %d years old", name, age);
        System.out.println(this.name);
        System.out.println(msg);
    }
}
