package com.quest.Streams;

import com.quest.FileHandling.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 2, 3, 7, 6);
        //Optional<Integer> largest = list.stream().max((i1, i2) -> i1 > i2 ? 1 : -1);

        Optional<Integer> secondlargest = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(secondlargest.get());

    }
}
