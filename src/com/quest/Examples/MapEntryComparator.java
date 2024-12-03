package com.quest.Examples;

import java.util.Comparator;
import java.util.Map;

public class MapEntryComparator implements Comparator<Map.Entry<Student,Integer>> {
    @Override
    public int compare(Map.Entry<Student,Integer> o1, Map.Entry<Student,Integer> o2) {
        Integer i1 = o1.getValue();
        Integer i2 = o2.getValue();
        if (i1 > i2) {
            return 1;
        }else if (i1 < i2) {
            return -1;
        }
        return 0;
    }

}
