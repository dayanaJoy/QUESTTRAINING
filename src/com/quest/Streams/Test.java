package com.quest.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(6);
        list.add(10);
        list.add(4);
        list.add(4);
        list.add(3);
        list.add(3);

        System.out.println("FIND FIRST : "+list.stream().findFirst());//first element print
        System.out.println("DISTINCT : "+list.stream().distinct());//return object
        System.out.println("DISTINCT COUNT : "+list.stream().distinct().count());
        System.out.println("FIND ANY : "+list.stream().findAny());//first element
        System.out.println("MAX : "+list.stream().max(Integer::compareTo).get());//return maximum element
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        System.out.println("min : " + min.get());
        System.out.println("MIN : "+list.stream().min(Integer::compareTo));//return minimum
        System.out.println("COUNT : "+list.stream().count());
        System.out.println("SUM : "+list.stream().reduce(0, Integer::sum));//identity add to sum of elements

        List<Integer> list2 = list.stream().filter(i -> i%2==0).toList();
        System.out.println("LIST 2 [EVEN] : "+list2);

        List<Integer> list3 = list.stream().map(i -> i*2).toList();//every element multiply by 2
        System.out.println("LIST 3 [XPLY BY 2] : "+list3);

        int a = list.stream().map(i -> i*2).reduce(0,Integer::sum);
        System.out.println("SUM : "+a);

        int b = list.stream().map(i -> i*2).max(Integer::compareTo).get();
        System.out.println("MAX : "+b);

        int c = list.stream().map(i -> i*2).min(Integer::compareTo).get();
        System.out.println("MIN : "+c);
    }
}
