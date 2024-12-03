package com.quest.Assessment.SecondAssessment;

import java.util.List;

public interface PlaylistOperations {
    void addTrack(Track track);
    void removeTrack(Track track);
    List<Track> findDuplicateTracks();
    List<Track> search(String keyword);
    void display();
    void shuffle();
}
