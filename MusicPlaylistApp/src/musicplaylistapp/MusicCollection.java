/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicplaylistapp;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author aorpr
 */


public class MusicCollection {
    private Queue<Song> likedSongs; // Queue for the liked songs
    private ArrayList<Playlist> playlists; // List of all playlists, including genre playlists

    public MusicCollection() {
        likedSongs = new LinkedList<>();
        playlists = new ArrayList<>();
    }

    public void addSongToLiked(Song song) {
        likedSongs.offer(song);
    }

    // Method to move a song from the liked songs to a specific genre playlist
    public void moveSongToGenrePlaylist(String genre) {
        if (likedSongs.isEmpty()) {
            System.out.println("Liked songs playlist is empty.");
            return;
        }
        Song song = likedSongs.poll(); // Retrieves and removes the head of the queue

        // Find or create the genre playlist
        Playlist genrePlaylist = findPlaylistByName(genre);
        if (genrePlaylist == null) {
            genrePlaylist = new Playlist(genre);
            playlists.add(genrePlaylist);
        }
        genrePlaylist.addSong(song);
    }

    private Playlist findPlaylistByName(String name) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equalsIgnoreCase(name)) {
                return playlist;
            }
        }
        return null;
    }

    // Additional methods for managing playlists... Will add soon, 
    // Include in the future: 
    // 1. Search for songs. Delete songs. List songs and playlists. 
    // 2. Repeat functinality for songs. repeat individual song or entire playlist?
    // 3. Implement to GUI
    
}
