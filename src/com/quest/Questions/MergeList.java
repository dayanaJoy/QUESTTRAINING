package com.quest.Questions;

import java.util.ArrayList;


public class MergeList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Mango");
        list2.add("Grapes");
        list1.addAll(list2);
        System.out.println("Merged List: " + list1);
    }
}

