package com.quest.Examples.Map;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String str = "Java is fun and java is powerful";
        str = str.toLowerCase();
        System.out.println(str);
        String[] words = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
