package com.quest.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkeList2 {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();
        //add
        list.add(new Person("Alice", 18, "Mumbai", "Female"));
        list.add(new Person("Bob", 25, "Delhi", "Male"));
        list.add(new Person("John", 22, "Kolkata", "Male"));
        list.add(new Person("Doe", 17, "Kerala", "Male"));
        list.add(new Person("Ann", 30, "Chennai", "Female"));

        //Display
        System.out.println("List: ");
        for (Person p : list) {
            p.printPerson();
        }
        //age<20
        System.out.println("\nBelow age : 20");
        for (Person p : list) {
            if (p.getAge() < 20) {
                p.printPerson();
            }
        }
        //above 20
        System.out.println("\nAbove age : 20");
        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            Person p = it.next();
            if (p.getAge() > 20) {
                p.printPerson();
            }
        }
        //Linkedlist Methods
        System.out.println("\n Linked List Methods");
        System.out.println("-------------------");
        //add to first
        list.addFirst(new Person("Arya", 17, "Hydrebad", "Female"));
        System.out.println("\nAfter adding to first position : ");
       for (Person p : list) {
           p.printPerson();
       }
        //add to last
        list.addLast(new Person("sona", 25, "Pune", "Female"));
        System.out.println("\nAfter adding to last position : ");
        for (Person p : list) {
            p.printPerson();
        }
        //add to 3rd(2nd index) poaition
        list.add(2, new Person("Ram", 19, "Goa", "Male"));
        System.out.println("\nAfter adding to Third position : ");
        for (Person p : list) {
            p.printPerson();
        }
        //remove first
        list.removeFirst();
        System.out.println("\nAfter removing first person : ");
        for (Person p : list) {
            p.printPerson();
        }
        //remove last
        list.removeLast();
        System.out.println("\nAfter removing last person : ");
        for (Person p : list) {
            p.printPerson();
        }
        //contains
        System.out.println("\nDoes the list contains Alice ? "+list.contains("John"));
        //size
        System.out.println("\nSize of list : " + list.size());
        //isempty
        System.out.println("\nIs Empty : "+list.isEmpty());
        //Print First
        System.out.println("\nFirst Person : "+list.getFirst());
        //print last
        System.out.println("\nLast Person : "+list.getLast());
    }

}
