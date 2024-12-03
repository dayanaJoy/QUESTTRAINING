package com.quest.CaeStudy.assd;

import java.util.*;

public class User {
    private String username;
    Map<String,Playlist> playlists;
    private Set<Track> favoriteTracks;

    public User(String username) {
        this.username = username;
        this.playlists = new HashMap<>();
        this.favoriteTracks = new HashSet<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<String, Playlist> getPlaylists(String playlist1) {
        return playlists;
    }

    public void setPlaylists(Map<String, Playlist> playlists) {
        this.playlists = playlists;
    }

    public Set<Track> getFavoriteTracks() {
        return favoriteTracks;
    }

    public void setFavoriteTracks(Set<Track> favoriteTracks) {
        this.favoriteTracks = favoriteTracks;
    }

    //create a new playlist
    public void createPlaylist(String playlistName) {
        playlists.put(playlistName,new Playlist(playlistName));
    }
    //Delete an existing playlist
    public void deletePlaylist(String playlistName) {
        try{
            if(playlists.containsKey(playlistName)) {
                playlists.remove(playlistName);
            } else {
                throw new NoSuchElementException("Playlist not found");
            }
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException : "+e.getMessage());
        }

    }
    //get a playlist by name
   /* public Playlist getPlaylists(String playlistName) {
        return playlists.get(playlistName);  // Return the Playlist object by name
    }*/

    /*public Map<String,Playlist> getPlaylistsAsMap(String playlistName) {
        Map<String,Playlist> name = new HashMap<>();
        try {
            if (playlists.get(playlistName) != null) {
                name.put(playlistName, playlists.get(playlistName));
            }
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException : "+e.getMessage());
        }
        return name;
    }*/
    //display all with details
    public void deletePlaylists() {
        playlists.forEach((k,v)->{
            System.out.println("Playlists : \n"+k+" : "+v);
        });
    }
    //merge 2 playlist
    /*public Map<String,Playlist> mergeplaylists(String playlist1, String playlist2)*/ /*{
        Map<String,Playlist> merge = new HashMap<>();
        Playlist list1 = playlists.get(playlist1);
        Playlist list2 = playlists.get(playlist2);
        try {

            if (list1 == null || list2 == null) {
                throw new NoSuchElementException("Playlist not found");
            }
        }catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException : "+e.getMessage());
        }
        Playlist mergeplaylist = new Playlist("Merged " + playlist1 + "-" + playlist2);
        for (Track t : list1.getTracks()) {
            mergeplaylist.addTrack(t);
        }
        for (Track t : list2.getTracks()) {
            try{
                mergeplaylist.addTrack(t);
                throw new DuplicateTrackException("Duplicate track to merge");
            } catch (DuplicateTrackException e) {
                System.out.println("Playlist already exist : "+e.getMessage());
            }
        }
        merge.put(mergeplaylist.getName(), mergeplaylist);
        return merge;
    }*/
    public Map<String, Playlist> mergeplaylists(String playlist1, String playlist2) {
        Playlist list1 = playlists.get(playlist1);
        Playlist list2 = playlists.get(playlist2);

        if (playlist1 != null && playlist2 != null) {
            Map<String, Playlist> mergedPlaylists = new HashMap<>();
            mergedPlaylists.put(playlist1, list1);
            mergedPlaylists.put(playlist2, list2);
            return mergedPlaylists;
        } else {
            System.out.println("One or both playlists not found.");
            return Collections.emptyMap();
        }
    }

    //mark track as favourite
    public void markfavorite(Track track) {
        favoriteTracks.add(track);
    }
    //unmark track as favourite
    public void unmarkfavorite(Track track) {
        favoriteTracks.remove(track);
    }
}
