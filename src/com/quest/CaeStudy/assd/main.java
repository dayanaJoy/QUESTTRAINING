/*
package com.quest.CaeStudy.assd;
import java.util.*;

public class main {
    public static void main(String[] args) {
            User user1 = new User("Alice");
            user1.createPlaylist("Rock Playlist");
            user1.createPlaylist("Pop Playlist");

            // Add tracks to the playlists
            Playlist playlist1 = user1.getPlaylists("Rock Playlist");  // No casting needed
            playlist1.addTrack(new Track(1, "Song A", "Artist 1", 3.5));
            playlist1.addTrack(new Track(2, "Song B", "Artist 2", 4.0));
            playlist1.addTrack(new Track(3, "Song C", "Artist 3", 2.8));

            Playlist playlist2 = user1.getPlaylists("Pop Playlist");  // No casting needed
            playlist2.addTrack(new Track(4, "Song D", "Artist 4", 4.5));
            playlist2.addTrack(new Track(5, "Song E", "Artist 5", 3.0));
*/
/*
                // Create users
                User user1 = new User("Alice");
                user1.createPlaylist("Rock Playlist");
                user1.createPlaylist("Pop Playlist");

                // Create and add tracks to the playlists
                Playlist rockPlaylist = (Playlist) user1.getPlaylists("Rock Playlist");
                rockPlaylist.addTrack(new Track(1, "Song A", "Artist 1", 3.5));
                rockPlaylist.addTrack(new Track(2, "Song B", "Artist 2", 4.0));
                rockPlaylist.addTrack(new Track(3, "Song C", "Artist 3", 2.8));

                Playlist popPlaylist = (Playlist) user1.getPlaylists("Pop Playlist");
                popPlaylist.addTrack(new Track(4, "Song D", "Artist 4", 4.5));
                popPlaylist.addTrack(new Track(5, "Song E", "Artist 5", 3.0));
                popPlaylist.addTrack(new Track(6, "Song F", "Artist 6", 5.8));

                Scanner sc = new Scanner(System.in);
                int choice;*//*


                do {
                    System.out.println("\nStreaming Platform Playlist Manager");
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
                    sc.nextLine(); // consume the newline character

                    switch (choice) {
                        case 1: // Create Playlist
                            System.out.print("Enter playlist name: ");
                            String playlistName = sc.nextLine();
                            user1.createPlaylist(playlistName);
                            System.out.println("Playlist '" + playlistName + "' created.");
                            break;

                        case 2: // Add Track to Playlist
                            System.out.print("Enter playlist name: ");
                            playlistName = sc.nextLine();
                            Playlist playlist = (Playlist) user1.getPlaylists(playlistName);
                            if (playlist != null) {
                                System.out.print("Enter track ID: ");
                                int id = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Enter track title: ");
                                String title = sc.nextLine();
                                System.out.print("Enter track artist: ");
                                String artist = sc.nextLine();
                                System.out.print("Enter track duration (in minutes): ");
                                double duration = sc.nextDouble();
                                sc.nextLine();
                                Track track = new Track(id, title, artist, duration);
                                playlist.addTrack(track);
                            } else {
                                System.out.println("Playlist not found.");
                            }
                            break;

                        case 3: // Remove Track from Playlist
                            System.out.print("Enter playlist name: ");
                            playlistName = sc.nextLine();
                            playlist = (Playlist) user1.getPlaylists(playlistName);
                            if (playlist != null) {
                                System.out.print("Enter track ID to remove: ");
                                int removeTrackId = sc.nextInt();
                                sc.nextLine();
                                Track removeTrack = new Track(removeTrackId, "", "", 0);
                                playlist.removeTrack(removeTrack);
                            } else {
                                System.out.println("Playlist not found.");
                            }
                            break;

                        case 4: // Display Tracks in Playlist
                            System.out.print("Enter playlist name: ");
                            playlistName = sc.nextLine();
                            playlist = (Playlist) user1.getPlaylists(playlistName);
                            if (playlist != null) {
                                playlist.display();
                            } else {
                                System.out.println("Playlist not found.");
                            }
                            break;

                        case 5: // Compare 2 Tracks (Test equals method)
                            System.out.print("Enter first track ID: ");
                            int id1 = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter second track ID: ");
                            int id2 = sc.nextInt();
                            sc.nextLine();
                            Track track1 = new Track(id1, "", "", 0);
                            Track track2 = new Track(id2, "", "", 0);
                            if (track1.equals(track2)) {
                                System.out.println("The tracks are equal.");
                            } else {
                                System.out.println("The tracks are not equal.");
                            }
                            break;

                        case 6: // Find Duplicates in Playlist
                            System.out.print("Enter playlist name: ");
                            playlistName = sc.nextLine();
                            playlist = (Playlist) user1.getPlaylists(playlistName);
                            if (playlist != null) {
                                List<Track> duplicates = playlist.findDuplicateTracks();
                                if (!duplicates.isEmpty()) {
                                    System.out.println("Duplicate tracks found:");
                                    for (Track t : duplicates) {
                                        System.out.println(t);
                                    }
                                } else {
                                    System.out.println("No duplicate tracks.");
                                }
                            } else {
                                System.out.println("Playlist not found.");
                            }
                            break;

                        case 7: // Sort Tracks by Duration or Title
                            System.out.print("Enter playlist name: ");
                            playlistName = sc.nextLine();
                            playlist = (Playlist) user1.getPlaylists(playlistName);
                            if (playlist != null) {
                                System.out.print("Sort by (1) Duration (2) Title: ");
                                int sortChoice = sc.nextInt();
                                sc.nextLine(); // consume newline
                                if (sortChoice == 1) {
                                    playlist.sortbyduration();
                                    System.out.println("Tracks sorted by duration.");
                                } else if (sortChoice == 2) {
                                    playlist.sortbytitle();
                                    System.out.println("Tracks sorted by title.");
                                } else {
                                    System.out.println("Invalid choice.");
                                }
                            } else {
                                System.out.println("Playlist not found.");
                            }
                            break;

                        case 8: // Shuffle Tracks in Playlist
                            System.out.print("Enter playlist name: ");
                            playlistName = sc.nextLine();
                            playlist = (Playlist) user1.getPlaylists(playlistName);
                            if (playlist != null) {
                                playlist.shuffle();
                                System.out.println("Tracks shuffled.");
                            } else {
                                System.out.println("Playlist not found.");
                            }
                            break;

                        case 9: // Merge Two Playlists
                            System.out.print("Enter first playlist name: ");
                            String playlist1 = sc.nextLine();
                            System.out.print("Enter second playlist name: ");
                            String playlist2 = sc.nextLine();
                            Map<String, Playlist> merged = user1.mergeplaylists(playlist1, playlist2);
                            if (!merged.isEmpty()) {
                                System.out.println("Playlists merged: ");
                                for (Map.Entry<String, Playlist> entry : merged.entrySet()) {
                                    System.out.println("Playlist name: " + entry.getKey());
                                    entry.getValue().display(); // Display merged playlists
                                }
                            } else {
                                System.out.println("No playlists merged.");
                            }
                            break;

                            */
/*System.out.print("Enter first playlist name: ");
                            String playlist1 = sc.nextLine();
                            System.out.print("Enter second playlist name: ");
                            String playlist2 = sc.nextLine();
                            Map<String, Playlist> merged = user1.mergeplaylists(playlist1, playlist2);
                            System.out.println("Playlists merged: " + merged);
                            break;*//*


                        case 10: // Rate Track
                            System.out.print("Enter track ID to rate: ");
                            int trackId = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter rating (1-5): ");
                            int rating = sc.nextInt();
                            sc.nextLine();
                            Track rateTrack = new Track(trackId, "", "", 0);
                            rateTrack.setRating(rating);
                            break;

                        case 11: // Display Tracks Sorted by Rating
                            System.out.print("Enter playlist name: ");
                            playlistName = sc.nextLine();
                            playlist = (Playlist) user1.getPlaylists(playlistName);
                            if (playlist != null) {
                                playlist.sortbyrating();
                                System.out.println("Tracks sorted by rating.");
                            } else {
                                System.out.println("Playlist not found.");
                            }
                            break;

                        case 12: // Mark/Unmark Track as Favorite
                            System.out.print("Enter track ID to mark/unmark as favorite: ");
                            int favTrackId = sc.nextInt();
                            sc.nextLine();
                            Track favTrack = new Track(favTrackId, "", "", 0);
                            System.out.print("Mark as favorite? (yes/no): ");
                            String mark = sc.nextLine();
                            if (mark.equalsIgnoreCase("yes")) {
                                user1.markfavorite(favTrack);
                            } else if (mark.equalsIgnoreCase("no")) {
                                user1.unmarkfavorite(favTrack);
                            }
                            break;

                        case 13: // Display Favorite Tracks
                            System.out.println("Favorite Tracks:");
                            for (Track t : user1.getFavoriteTracks()) {
                                System.out.println(t);
                            }
                            break;

                        case 14: // Exit
                            System.out.println("Exiting...");
                            break;

                        default:
                            System.out.println("Invalid choice, please try again.");
                    }
                } while (choice != 14);

        sc.close();
    }
}
*/
