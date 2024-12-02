package com.quest.Collections.Sample;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1,"Alice",20,"Female");
        Person p2 = new Person(2,"Bob",30,"Male");
        Person p3 = new Person(3,"Charlie",40,"Female");
        Person p4 = new Person(4,"David",50,"Male");
        Person p5 = new Person(5,"Jack",70,"Male");
        //list
        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        System.out.println("\nList of persons : "+persons);

        persons.add(3,new Person(6,"John",10,"Male"));
        System.out.println("\nAdding new person to 4th position : "+persons);

        persons.get(2).setGender("Male");
        System.out.println("\nModifing the data of 3rd elememt gender from Female to Male in   : "+persons);

        //set
        System.out.println("\n SET : ");
        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        System.out.println("\nList of persons : "+set);

        set.add(new Person(6,"John",10,"Male"));
        System.out.println("\nAdding new person to the set: "+set);

        //map
        System.out.println("\n MAP : ");
        Map<Integer,Person> map = new HashMap<>();
        map.put(1,p1);
        map.put(2,p2);
        map.put(3,p3);
        map.put(4,p4);
        map.put(5,p5);
        System.out.println("\nMap of persons : " + map);


        //QUEUE
        System.out.println("\n QUEUE : ");
        PriorityQueue<Person> queue = new PriorityQueue<>();
        queue.add(p1);
        queue.add(p2);
        queue.add(p3);
        queue.add(p4);
        queue.add(p5);
        System.out.println("\nList of persons : "+queue);
        while(!queue.isEmpty()){
            System.out.println( queue.poll());
        }
    }
}
