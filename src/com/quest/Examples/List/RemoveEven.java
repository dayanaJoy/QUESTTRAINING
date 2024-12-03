package com.quest.Examples.List;

import java.util.ArrayList;
import java.util.List;

public class RemoveEven {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("List : " + list);
        list.removeIf(x -> x % 2 == 0);
        System.out.println("List(after removing even numbers) : " + list);
    }
}
