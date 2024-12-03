package com.quest.Examples;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main1 {
    public static void main(String[] args) {
        Students student1 = new Students("John", 3);
        Students student2 = new Students("Jane", 2);
        Students student3 = new Students("Charlie", 1);

        Map<Students, Integer> studentMap = new HashMap<>();
        studentMap.put(student1, student1.getId());
        studentMap.put(student2, student2.getId());
        studentMap.put(student3, student3.getId());

        TreeMap<Students, Integer> sortmap = new TreeMap<>(new StudentIdComparator());
        sortmap.putAll(studentMap);
        sortmap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
