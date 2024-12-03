package com.quest.Examples;

import java.util.*;

public class main {
    public static void main(String[] args) {
    Student s1 = new Student(1,"s1");
    Student s2 = new Student(2,"s2");
    Student s3 = new Student(3,"s3");
    Student s4 = new Student(4,"s4");
    Student s5 = new Student(5,"s5");

    Map<Student, Integer> studentsMarksMap = new HashMap<>();
    studentsMarksMap.put(s1, 60);
    studentsMarksMap.put(s2, 65);
    studentsMarksMap.put(s3, 50);
    studentsMarksMap.put(s4, 70);
    studentsMarksMap.put(s5, 45);

    //sort the above map on the basis of student's marks ( which is values inside the map )
        List<Map.Entry<Student, Integer>> entries = new ArrayList<>(studentsMarksMap.entrySet());
        for (Map.Entry<Student, Integer> entry : studentsMarksMap.entrySet()) {
            entries.add(entry);
        }

        entries.sort(Map.Entry.comparingByValue());
        studentsMarksMap = new LinkedHashMap<>();
        for (Map.Entry<Student, Integer> entry : entries) {
            studentsMarksMap.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<Student, Integer> entry : studentsMarksMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}



























































        /*
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 3);
        map.put("Jane", 2);
        map.put("Bob", 4);
        map.put("Mary", 5);
        map.put("Doe", 1);
        System.out.println("Map : " + map);
        Map<String, Integer> sortedMap = new TreeMap<>(((o1, o2) -> map.get(o1).compareTo(map.get(o2))));
        sortedMap.putAll(map);
        System.out.println("SortedMap : " + sortedMap);*/

/*
Map<String, Integer> sortedMap1 = new TreeMap<>(map);
        System.out.println("Map : " + sortedMap1);*/