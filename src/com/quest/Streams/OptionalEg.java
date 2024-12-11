package com.quest.Streams;

import java.util.Optional;

public class OptionalEg {
    public static void main(String[] args) {
        //non null
        Optional<String> optional = Optional.of("hello");
        System.out.println(optional.isPresent());//check
        System.out.println(optional.get());//print

    }
}
