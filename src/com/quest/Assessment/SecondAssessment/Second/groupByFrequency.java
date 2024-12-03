package com.quest.Assessment.SecondAssessment.Second;

import java.util.*;

public class groupByFrequency {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3));
        Map<Integer, List<Integer>> map = new TreeMap<>(groupByFrequency(input));
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<Integer, List<Integer>> groupByFrequency(List<Integer> numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // Count frequency of each number
        for (Integer number : numbers) {
            if (!frequencyMap.containsKey(number)) {
                frequencyMap.put(number, 1);
            } else {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            }
        }

        Map<Integer, List<Integer>> frequencyGroupMap = new HashMap<>();
        // Group numbers by frequency
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            int number = entry.getKey();

            if (!frequencyGroupMap.containsKey(frequency)) {
                List<Integer> list = new ArrayList<>();
                list.add(number);
                frequencyGroupMap.put(frequency, list);
            } else {
                frequencyGroupMap.get(frequency).add(number);
            }
        }

        return frequencyGroupMap;
    }
}





