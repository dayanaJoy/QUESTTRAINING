package com.quest.CaeStudy.assd;

import java.util.List;

public interface PlaylistOperations {
    public void addTrack(Track track);  //add a track
    public void removeTrack(Track track);   //remove a track
    public List<Track> findDuplicateTracks();   //find duplicates
    public List<Track> search(String keyword);  //search for track by title or artist
    public void display();  //display all tracks
   // public void sort(Comparator<Track> comparator); //sort tracks by duration or title
    public void shuffle();  //shuffle tracks
}
