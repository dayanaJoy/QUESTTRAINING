package com.quest.Collections;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Alice");
        list.add("Dane");
        list.add("bob");
        list.add("Jane");
        list.add("Manu");

        //list.addFirst("Hello");//Not in arraylist
       // list.addLast("World");
        //list.add(5,"Ann");
        //System.out.println(list.getFirst());//only in linkedlist
        //System.out.println(list.getLast());//same
        //System.out.println(list.get(0));
        //System.out.println(list.removeFirst());
        //System.out.println(list.removeLast());
        //System.out.println(list.remove(2));
        //list.remove();//by default oth index element removed
        //list.clear();
        //System.out.println(list.size());//voth array and linkedlist
        for(String s : list){
            //System.out.println(s);
        }

        //LinkedList<String> list2 = new LinkedList<>();
        LinkedList<Person> list2 = new LinkedList<>();
        System.out.println(list2.isEmpty());//true(nodata)
        System.out.println(list.isEmpty());//false
        System.out.println(list.contains("Alice"));//true (ifavailabe)
        Person p = new Person();
        list2.remove(p);

    }
}
