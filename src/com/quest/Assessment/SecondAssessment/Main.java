package com.quest.Assessment.SecondAssessment;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alice");
        user1.createPlaylist("Rock Playlist");
        user1.createPlaylist("Pop Playlist");

        Playlist rockPlaylist = user1.getPlaylists("Rock Playlist");
        rockPlaylist.addTrack(new Track(1, "Song A", "Artist 1", 3.5));
        rockPlaylist.addTrack(new Track(2, "Song B", "Artist 2", 4.0));
        rockPlaylist.addTrack(new Track(3, "Song C", "Artist 3", 2.8));

        Playlist popPlaylist = user1.getPlaylists("Pop Playlist");
        popPlaylist.addTrack(new Track(4, "Song D", "Artist 4", 4.5));
        popPlaylist.addTrack(new Track(5, "Song E", "Artist 5", 3.0));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStreaming Platform Playlist Manager ");
            System.out.println("1. Create Playlist");
            System.out.println("2. Add Track to Playlist");
            System.out.println("3. Remove Track from Playlist");
            System.out.println("4. Display Tracks in Playlist");
            System.out.println("5. Compare 2 Tracks (Test equals method)");
            System.out.println("6. Find Duplicates in Playlist");
            System.out.println("7. Sort Tracks by Duration or Title");
            System.out.println("8. Shuffle Tracks in Playlist");
            System.out.println("9. Merge Two Playlists");
            System.out.println("10. Rate Track");
            System.out.println("11. Display Tracks Sorted by Rating");
            System.out.println("12. Mark/Unmark Track as Favorite");
            System.out.println("13. Display Favorite Tracks");
            System.out.println("14. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter playlist name: ");
                    String name = sc.nextLine();
                    user1.createPlaylist(name);
                    break;

                case 2:
                    System.out.print("Enter playlist name: ");
                    String playlistName = sc.nextLine();
                    System.out.print("Enter track title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter track artist: ");
                    String artist = sc.nextLine();
                    System.out.print("Enter track duration: ");
                    double duration = sc.nextDouble();
                    sc.nextLine();

                    Track track = new Track(1, title, artist, duration);
                    user1.getPlaylists(playlistName).addTrack(track);
                    break;

                case 3:
                    System.out.print("Enter playlist name: ");
                    playlistName = sc.nextLine();
                    System.out.print("Enter track title: ");
                    title = sc.nextLine();
                    System.out.print("Enter track artist: ");
                    artist = sc.nextLine();
                    System.out.print("Enter track duration: ");
                    duration = sc.nextDouble();
                    sc.nextLine();

                    track = new Track(1, title, artist, duration);
                    user1.getPlaylists(playlistName).removeTrack(track);
                    break;

                case 4:
                    System.out.print("Enter playlist name: ");
                    playlistName = sc.nextLine();
                    user1.getPlaylists(playlistName).display();
                    break;

                case 5:
                    // Compare 2 Tracks
                    System.out.print("Enter first track ID: ");
                    int trackId1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter first track title: ");
                    String trackTitle1 = sc.nextLine();
                    System.out.print("Enter first track artist: ");
                    String trackArtist1 = sc.nextLine();
                    System.out.print("Enter first track duration: ");
                    double trackDuration1 = sc.nextDouble();

                    Track track1 = new Track(trackId1, trackTitle1, trackArtist1, trackDuration1);

                    System.out.print("Enter second track ID: ");
                    int trackId2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter second track title: ");
                    String trackTitle2 = sc.nextLine();
                    System.out.print("Enter second track artist: ");
                    String trackArtist2 = sc.nextLine();
                    System.out.print("Enter second track duration: ");
                    double trackDuration2 = sc.nextDouble();
                    sc.nextLine();

                    Track track2 = new Track(trackId2, trackTitle2, trackArtist2, trackDuration2);

                    if (track1.equals(track2)) {
                        System.out.println("The two tracks are identical.");
                    } else {
                        System.out.println("The two tracks are not identical.");
                    }
                    break;

                case 6:
                    // Find duplicates in playlist
                    System.out.print("Enter playlist name: ");
                    playlistName = sc.nextLine();
                    Set<Track> uniqueTracks = new HashSet<>();
                    Playlist playlist = user1.getPlaylists(playlistName);

                    Set<Track> duplicates = new HashSet<>();
                    for (Track t : playlist.getTracks()) {
                        if (!uniqueTracks.add(t)) {
                            duplicates.add(t);
                        }
                    }

                    if (duplicates.isEmpty()) {
                        System.out.println("No duplicate tracks found.");
                    } else {
                        System.out.println("Duplicate tracks:");
                        for (Track duplicate : duplicates) {
                            System.out.println(duplicate);
                        }
                    }
                    break;

                case 7:
                    System.out.print("Enter playlist name: ");
                    playlistName = sc.nextLine();
                    System.out.print("Sort by 1. Duration, 2. Title, 3. Rating: ");
                    int sortChoice = sc.nextInt();
                    sc.nextLine();

                    if (sortChoice == 1) {
                        user1.getPlaylists(playlistName).sortByDuration();
                    } else if (sortChoice == 2) {
                        user1.getPlaylists(playlistName).sortByTitle();
                    } else if (sortChoice == 3) {
                        user1.getPlaylists(playlistName).sortByRating();
                    }
                    break;

                case 8:
                    System.out.print("Enter playlist name: ");
                    playlistName = sc.nextLine();
                    user1.getPlaylists(playlistName).shuffle();
                    break;

                case 9:
                    System.out.print("Enter first playlist name: ");
                    String playlistName1 = sc.nextLine();
                    System.out.print("Enter second playlist name: ");
                    String playlistName2 = sc.nextLine();
                    Playlist playlist1 = user1.getPlaylists(playlistName1);
                    Playlist playlist2 = user1.getPlaylists(playlistName2);

                    // Merging two playlists
                    playlist1.getTracks().addAll(playlist2.getTracks());
                    break;

                case 10:
                    System.out.print("Enter playlist name to rate a track: ");
                    String playlistNameToRate = sc.nextLine();
                    Playlist playlistToRate = user1.getPlaylists(playlistNameToRate);

                    System.out.print("Enter track ID to rate: ");
                    int trackIdToRate = sc.nextInt();
                    System.out.print("Enter rating (1-5): ");
                    int ratingToSet = sc.nextInt();
                    sc.nextLine();

                    // Find the track by its ID in the selected playlist
                    Track trackToRate = null;
                    for (Track tracks : playlistToRate.getTracks()) {
                        if (tracks.getId() == trackIdToRate) {
                            trackToRate = tracks;
                            break;
                        }
                    }

                    if (trackToRate != null) {
                        trackToRate.setRating(ratingToSet);
                        System.out.println("Track ID " + trackToRate.getId() + " has been rated " + trackToRate.getRating());
                    } else {
                        System.out.println("Track with ID " + trackIdToRate + " not found in the playlist.");
                    }
                    break;


                case 11:
                    System.out.print("Enter playlist name: ");
                    playlistName = sc.nextLine();
                    user1.getPlaylists(playlistName).sortByRating();
                    break;

                case 12:
                    System.out.print("Enter playlist name to mark/unmark a track as favorite: ");
                    String playlistNameToFavorite = sc.nextLine();
                    Playlist playlistToFavorite = user1.getPlaylists(playlistNameToFavorite);

                    System.out.print("Enter track ID to mark/unmark as favorite: ");
                    int trackIdToFavorite = sc.nextInt();
                    sc.nextLine();

                    // Find the track by its ID in the selected playlist
                    Track trackToFavorite = null;
                    for (Track track3 : playlistToFavorite.getTracks()) {
                        if (track3.getId() == trackIdToFavorite) {
                            trackToFavorite = track3;
                            break;
                        }
                    }

                    if (trackToFavorite != null) {
                        // Check if the track is already in favorites
                        if (!user1.getFavorites().contains(trackToFavorite)) {
                            user1.markFavorite(trackToFavorite);
                            System.out.println("Track ID " + trackToFavorite.getId() + " has been marked as favorite.");
                        } else {
                            user1.unmarkFavorite(trackToFavorite);
                            System.out.println("Track ID " + trackToFavorite.getId() + " has been unmarked from favorite.");
                        }
                    } else {
                        System.out.println("Track with ID " + trackIdToFavorite + " not found in the playlist.");
                    }
                    break;


                case 13:
                    user1.displayFavorites();
                    break;

                case 14:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (choice != 14);

        sc.close();
    }
}
