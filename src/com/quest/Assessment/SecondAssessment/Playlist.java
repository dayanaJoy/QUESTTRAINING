package com.quest.Assessment.SecondAssessment;

import java.util.*;

public class Playlist implements PlaylistOperations {
    private String name;
    private List<Track> tracks;

    public Playlist(String name) {
        this.name = name;
        this.tracks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    @Override
    public void addTrack(Track track)  {
        try {
            if (tracks.contains(track)) {
                System.out.println("Track already exists");
            }
        }catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
        this.tracks.add(track);
    }

    @Override
    public void removeTrack(Track track) {
        if (!tracks.contains(track)) {
            System.out.println("Track does not exist");
            return;
        }
        tracks.remove(track);
    }


    public List<Track> findDuplicateTracks() {
        Set<Track> uniqueTracks = new HashSet<>();
        List<Track> duplicateTracks = new ArrayList<>();
        for (Track track : tracks) {
            if (!uniqueTracks.add(track)) {
                duplicateTracks.add(track);
            }
        }
        return duplicateTracks;
    }


    public List<Track> search(String keyword) {
        List<Track> result = new ArrayList<>();
        for (Track track : tracks) {
            if (track.getTitle().equalsIgnoreCase(keyword) || track.getArtist().equalsIgnoreCase(keyword)) {
                result.add(track);
            }
        }
        return result;
    }

    @Override
    public void display() {
        for (Track track : tracks) {
            System.out.println(track);
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(tracks);
    }

    public void sortByDuration() {
        Collections.sort(tracks, new DurationComparator());
    }

    public void sortByTitle() {
        Collections.sort(tracks, new TitleComparator());
    }

    public void sortByRating() {
        Collections.sort(tracks, new RatingComparator());
    }
}
