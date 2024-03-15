/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicplaylistapp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Deque;

/**
 *
 * @author aorpr
 */


public class MusicCollection {
    private Deque<Song> likedSongs; // Queue for the liked songs
    private List<Playlist> genrePlaylists; // List of all playlists, including genre playlists

    public MusicCollection() {
        this.likedSongs = new ArrayDeque<>();
        this.genrePlaylists = new ArrayList<>();
    }

    public void addSongToLiked(Song song) {
        likedSongs.push(song); // Stack operation, adding song to the "liked" playlist
    }
    
    
    public Song removeLastLikedSong() {
        return likedSongs.pop(); // Stack operation, removing the last liked song
    }

    // Method to move a song from the liked songs to a specific genre playlist
    public void moveLastLikedToGenre(String genre) {
        if (likedSongs.isEmpty()) {
            System.out.println("Liked songs playlist is empty.");
            return;
        }
        Song songToMove = removeLastLikedSong(); // Retrieves and removes the last liked song

        // Find or create the genre playlist
        Playlist genrePlaylist = findOrCreatePlaylist(genre);
        genrePlaylist.addSong(songToMove);
    }

    private Playlist findOrCreatePlaylist(String genre) {
        for (Playlist playlist : genrePlaylists) {
            if (playlist.getName().equalsIgnoreCase(genre)) {
                return playlist;
            }
        }
        Playlist newPlaylist = new Playlist(genre);
        genrePlaylists.add(newPlaylist);
        return newPlaylist;
    }
    
        public List<Song> searchSongsByTitle(String title) {
        List<Song> foundSongs = new ArrayList<>();
        //Search in the Liked playlist
        for (Song song : likedSongs) {
                if (song.getTitle().equalsIgnoreCase(title)) {
                    foundSongs.add(song);
                }
            }
            for (Playlist playlist : genrePlaylists){
                for (Song song : playlist.getSongs()){
                    if (song.getTitle().equalsIgnoreCase(title)){
                        foundSongs.add(song);
                    }
                }
            }
            return foundSongs;
    }
    

    // Additional methods for managing playlists... Will add soon, 
    // Include in the future: 
    // 1. Search for songs. Delete songs. List songs and playlists. 
    // 2. Repeat functinality for songs. repeat individual song or entire playlist?
    // 3. Implement to GUI
    
    //1 Search function to look for songs

    

}
