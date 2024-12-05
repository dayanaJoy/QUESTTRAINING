package com.quest.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StudentPredicate {
    List<String> students = new ArrayList<>(Arrays.asList("John", "Jane", "Paul", "Alice", "Bob", "Doe"));
    Predicate<String> predicate = s -> {
        System.out.println(s.toUpperCase());
        System.out.println("Length : " + s.length());
        return false;
    };

    public Predicate<String> getPredicate() {
        return predicate;
    }



}
