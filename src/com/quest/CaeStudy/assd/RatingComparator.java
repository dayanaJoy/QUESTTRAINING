package com.quest.CaeStudy.assd;

import java.util.Comparator;

public class RatingComparator implements Comparator<Track> {
    @Override
    public int compare(Track o1, Track o2) {
        if (o1.getRating() > o2.getRating()) {
            return 1;
        } else if (o1.getRating() < o2.getRating()) {
            return -1;
        }
        return 0;
    }
}
