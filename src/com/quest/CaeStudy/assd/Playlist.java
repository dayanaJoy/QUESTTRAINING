package com.quest.CaeStudy.assd;

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

    public void setName(String name) {
        this.name = name;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    //add a track
    @Override
    public void addTrack(Track track) {
        try {
            if (!tracks.contains(track)) {
                throw new DuplicateTrackException("Track already exist");
            }
            this.tracks.add(track);
        } catch (DuplicateTrackException e) {
            System.out.println("DuplicateTrackException : " + e.getMessage());
        }
    }

    //remove a track
    @Override
    public void removeTrack(Track track) {
        try {
            if (!tracks.contains(track)) {
                throw new NoSuchElementException("Track does not exist");
            }
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException : " + e.getMessage());
        }
        tracks.remove(track);
    }

    //find duplicates
    @Override
    public List<Track> findDuplicateTracks() {
        Set<Track> UniqueTracks = new HashSet<>();
        List<Track> duplicateTrackList = new ArrayList<>();
        for (Track track : tracks) {
            if (!UniqueTracks.add(track)) {
                duplicateTrackList.add(track);
            }
        }
        return duplicateTrackList;
    }

    //search for track by title or artist
    @Override
    public List<Track> search(String keyword) {
        List<Track> list = new ArrayList<>();
        try {
            for (Track track : tracks) {
                if (track.getTitle().equalsIgnoreCase(keyword) || (track.getArtist().equalsIgnoreCase(keyword))) {
                    list.add(track);
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException : " + e.getMessage());
        }
        return list;
    }

    //display all tracks
    @Override
    public void display() {
        tracks.forEach(track -> System.out.println(track));
    }

    //sort tracks by duration or title
    /*@Override
    public void sort(Comparator<Track> comparator) {
        tracks.sort(comparator);
    }*/

    //shuffle tracks
    @Override
    public void shuffle() {
        Collections.shuffle(tracks);
    }

    //sort by duration(ascending)
    public void sortbyduration() {
        Collections.sort(tracks, new DurationComparator());
    }

    //sort by title
    public void sortbytitle(){
        Collections.sort(tracks, new TitleComparator());
    }

    //sort by rating
    public void sortbyrating() {
        Collections.sort(tracks, new RatingComparator());
    }
}