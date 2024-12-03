package com.quest.CaeStudy.assd;

import java.util.Comparator;

public class DurationComparator implements Comparator<Track> {
    @Override
    public int compare(Track o1, Track o2) {
        return Double.compare( o1.getDuration(), o2.getDuration());
    }
}
