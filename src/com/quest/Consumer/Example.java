package com.quest.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Original List :" + numbers);

        Predicate<Integer> isEven = num -> num % 2 == 0;    //even

        Consumer<Integer> multiplyByTwo = num -> System.out.print(num * 2 + " ");   //even number xply by 2

        Supplier<List<Integer>> transformedList = () -> {
            List<Integer> list = new ArrayList<>();
            for (Integer num : numbers) {
                if (isEven.test(num)) {
                    list.add(num * 2);
                }
            }
            return list;
        };

        //even numbers
        System.out.println("Even Numbers:");
        numbers.forEach(num -> {
            if (isEven.test(num)) {
                System.out.print(num + " ");
            }
        });
        //even numbers multiplied by 2
        System.out.println("\nEven Numbers Multiplied by 2:");
        numbers.forEach(num -> {
            if (isEven.test(num)) {
                multiplyByTwo.accept(num);
            }
        });

        // Get and print the transformed list
        List<Integer> list = transformedList.get();
        System.out.println("\nTransformed List :");
        System.out.println(list);
    }
}

