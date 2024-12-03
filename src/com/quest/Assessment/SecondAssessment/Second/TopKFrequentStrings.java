
package com.quest.Assessment.SecondAssessment.Second;

import java.util.*;

public class TopKFrequentStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "banana");
        int k = 2;
        System.out.println(findTopKFrequent(list, k));
    }

    public static List<String> findTopKFrequent(List<String> list, int k) {
        // Count frequencies of each string
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String s : list) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }

        // Sort the map entries by frequency and alphabetically for ties
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        entryList.sort((a, b) -> b.getValue() == a.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue());

        // Get top k frequent elements
        List<String> topKFrequent = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            topKFrequent.add(entryList.get(i).getKey());
        }

        return topKFrequent;
    }
}
