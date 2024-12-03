package com.quest.Examples;

import java.util.Comparator;
import java.util.Map;

class StudentIdComparator implements Comparator<Students> {
    @Override
    public int compare(Students student1, Students student2) {
        if (student1.getId() < student2.getId()) {
            return -1;
        } else if (student1.getId() > student2.getId()) {
            return 1;
        } else {
            return 0;
        }
    }
}


























//return Integer.compare(student1.getId(), student2.getId());

