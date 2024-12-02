package com.quest.Examples.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Secondlargest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>((Arrays.asList(5,3,44,67,2,1)));
        System.out.println("List : "+list);
        int largest = 0;
        int SecondLargest = 0;
        for (int num : list) {
            if (num > largest) {
                SecondLargest = largest;
                largest = num;
            }
        }
        System.out.println("SecondLargest : "+SecondLargest);
    }
}
