package com.quest.FunctionalInterface;

import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Supplier<Integer> randomnumbers = () -> {
            System.out.println("Number : ");
            return sc.nextInt();
        };

        Predicate<Integer> iseven = evencheck::even;

        Function<Integer,Integer> function = num -> iseven.test(num)?num*num : num*2;

        int number = randomnumbers.get();
        if(iseven.test(number)){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
        Optional<Integer> result = iseven.test(number)?Optional.of(function.apply(number)):Optional.of(function.apply(number));

        Consumer<String> resultprint = System.out::println;

        result.ifPresentOrElse(
                num -> resultprint.accept("Result : "+num),
                () -> resultprint.accept("No Result")
        );
        sc.close();
    }

    class evencheck{
        public static boolean even(int num){
            return num%2 == 0;
        }
    }
}
