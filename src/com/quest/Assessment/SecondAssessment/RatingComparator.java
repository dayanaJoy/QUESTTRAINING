package com.quest.Assessment.SecondAssessment;

import java.util.Comparator;

public class RatingComparator implements Comparator<Track> {
    @Override
    public int compare(Track o1, Track o2) {
        return Integer.compare(o1.getRating(), o2.getRating());
    }
}
