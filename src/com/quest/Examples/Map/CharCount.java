package com.quest.Examples.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("String: " + str);
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
