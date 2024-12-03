package com.quest.Assessment.SecondAssessment.Second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6,7));
        System.out.println(numbers);
        int partitionSize = 2;
        System.out.println(partitionList(numbers, partitionSize));
    }

    public static List<List<Integer>> partitionList(List<Integer> numbers, int partitionSize) {
        List<List<Integer>> partitions = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i += partitionSize) {
            List<Integer> partition = new ArrayList<>();
            for (int j = i; j < i + partitionSize && j < numbers.size(); j++) {
                partition.add(numbers.get(j));
            }
            partitions.add(partition);
        }
        return partitions;
    }
}
