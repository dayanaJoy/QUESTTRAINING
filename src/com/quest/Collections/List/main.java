package com.quest.Collections.List;

import java.util.ArrayList;

import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Alice",18,"Mumbai","Female"));
        list.add(new Person("Bob",25,"Delhi","Male"));
        list.add(new Person("John",22,"Kolkata","Male"));
        list.add(new Person("Doe",17,"Kerala","Male"));
        list.add(new Person("Ann",30,"Chennai","Female"));
        list.add(5,new Person("Jane",25,"Mumbai","Female"));
        System.out.println("List : " );
        //display
        for(Person p : list){
            System.out.println("Name : " + p.getName() + "\tAge : " + p.getAge() + "\tLocation : " + p.getLocation() + "\tGender: " + p.getGender());
        }

        System.out.println("\nBelow age : 20 ");
        //for loop
        for (Person p : list) {
            if(p.getAge() < 20){
                System.out.println("Name : " + p.getName() + "\tAge : " + p.getAge() + "\tLocation : " + p.getLocation() + "\tGender: " + p.getGender());
            }
        }

        System.out.println("\nAbove age : 20 ");
        //Iterator
        Iterator<Person> it = list.iterator();
        while(it.hasNext()){
            Person p = it.next();
            if(p.getAge() > 20){
                System.out.println("Name : " + p.getName() + "\tAge : " + p.getAge() + "\tLocation : " + p.getLocation() + "\tGender: " + p.getGender());
            }
        }
    }
}
