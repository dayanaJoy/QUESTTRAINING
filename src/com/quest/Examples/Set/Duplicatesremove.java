package com.quest.Examples.Set;

import java.util.*;

public class Duplicatesremove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("Apple", "Banana", "Orange", "Grape","Apple"));
        System.out.println("List(with duplicates) : " + list);
        Set set = new HashSet(list);
        System.out.println("Set(Remove duplicates) : " + set);
    }
}
