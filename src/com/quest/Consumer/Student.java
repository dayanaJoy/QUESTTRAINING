package com.quest.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Student {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>(Arrays.asList("John", "Jane", "Paul", "Alice", "Bob", "Doe"));
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());//name
        Consumer<String> consumer1 = s -> System.out.println("Length : " + s.length());//length
        Predicate<String> predicate = s -> s.length() >= 4;//length > 4
        Supplier<List<String>> supplier = () -> {
            List<String> newList = new ArrayList<>(students);
            newList.add("Sam");
            return newList;
        };
        students.forEach(s -> {
            consumer.accept(s);
            consumer1.accept(s);
            System.out.println("Length > 4: " +predicate.test(s));
        });
        supplier.get();
        System.out.println("\nUpdated List: " + students);
    }
}