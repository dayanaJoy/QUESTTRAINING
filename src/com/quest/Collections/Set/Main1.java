package com.quest.Collections.Set;


import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        TreeSet<Person1> set = new TreeSet<>();
        set.add(new Person1("Bob",30));
        set.add(new Person1("John",20));
        set.add(new Person1("Mary",40));
        set.add(new Person1("Jane",25));
        set.forEach(System.out::println);
    }
}
