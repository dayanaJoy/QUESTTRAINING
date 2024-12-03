package com.quest.Assessment.SecondAssessment;

import java.util.*;

public class User {
    private String username;
    private Map<String, Playlist> playlists;
    private Set<Track> favoriteTracks;

    public User(String username) {
        this.username = username;
        this.playlists = new HashMap<>();
        this.favoriteTracks = new HashSet<>();
    }

    public String getUsername() {
        return username;
    }

    public Playlist getPlaylists(String playlistName) {
        return playlists.get(playlistName);
    }

    public Set<Track> getFavorites() {
        Set<Track> favorites = new HashSet<>();
        return favorites;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPlaylists(Map<String, Playlist> playlists) {
        this.playlists = playlists;
    }

    public void setFavoriteTracks(Set<Track> favoriteTracks) {
        this.favoriteTracks = favoriteTracks;
    }

    //create
    public void createPlaylist(String playlistName) {
        playlists.put(playlistName, new Playlist(playlistName));
    }

    //delete
    public void deletePlaylist(String playlistName) {
        playlists.remove(playlistName);
    }

    //mark fav
    public void markFavorite(Track track) {
        favoriteTracks.add(track);
    }

    //unmark
    public void unmarkFavorite(Track track) {
        favoriteTracks.remove(track);
    }

    public void displayFavorites() {
        for (Track track : favoriteTracks) {
            System.out.println(track);
        }
    }



}
