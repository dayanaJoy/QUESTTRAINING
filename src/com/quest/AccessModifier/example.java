package com.quest.AccessModifier;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class example {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("John","Alice","Bob","Jane","Sam");
        List<String> result = name.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
