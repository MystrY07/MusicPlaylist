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
    private List<Song> allSongs;
    private Deque<Song> likedSongs; // Queue for the liked songs
    private List<Playlist> genrePlaylists; // List of all playlists, including genre playlists
    private List<Song> popSongs;
    private List<Song> rapSongs;
    private Deque<Song> likedOrder = new ArrayDeque<>(); 

    public MusicCollection() {
        this.likedSongs = new ArrayDeque<>();
        this.genrePlaylists = new ArrayList<>();
        this.allSongs = new ArrayList<>();
        this.popSongs = new ArrayList<>();
        this.rapSongs = new ArrayList<>();
        this.likedOrder = new ArrayDeque<>();
    }

    public List<Song> getLikedSongs() {
        return new ArrayList<>(likedSongs); // Or appropriate logic to return liked songs
    }
    
    public void addSong(Song song){
        allSongs.add(song);
    }
    
    public List<Song> getAllSongs(){
        return allSongs;
    }

    //implemented checker for duplicates before being added to "liked" list
    public boolean addSongToLiked(Song song) {
        if (!likedSongs.contains(song)) {
            likedSongs.add(song);
            return true; // Song was added successfully
        }
        return false; // Song was not added because it's a duplicate // Stack operation, adding song to the "liked" playlist
    }        
    //add songs to Pop playlist    
    public boolean addSongToPop() {
        if (!likedSongs.isEmpty()) {
            Song song = likedSongs.pop();
            popSongs.add(song);
            return true;
        }
        return false;
    }
    
    //add songs to rap playlist
    public boolean addSongToRap() {
        if (!likedSongs.isEmpty()) {
            Song song = likedSongs.pop();
            rapSongs.add(song);
            return true;
        }
        return false;
    }
    
    public List<Song> getPopSongs(){
        return popSongs;
    }
    
    public List<Song> getRapSongs(){
        return rapSongs;
    }

    //Method to remove most recent song from Pop playlist and puts it back into "liked" list
    public boolean removeFromPopAndLike() {
        if (!popSongs.isEmpty()) {
            Song song = popSongs.remove(popSongs.size() - 1); // Remove the last song
            likedSongs.push(song); // Add it back to the "Liked" list
            return true;
        }
        return false;
    }
    
    //Method to remove most recent song from rap playlist and puts it bac into "liked" list.
    public boolean removeFromRapAndLike() {
        if (!rapSongs.isEmpty()) {
            Song song = rapSongs.remove(rapSongs.size() - 1); // Remove the last song
            likedSongs.push(song); // Add it back to the "Liked" list
            return true;
        }
        return false;
    }
    
    public Song peekLastAddedSong() {
        if (!allSongs.isEmpty()) {
            return allSongs.get(allSongs.size() - 1); // Get the last song in the list
        }
        return null; // Return null if the list is empty
    }
    
    public boolean likeNextSong() {
        for (Song song : allSongs) {
            if (!likedSongs.contains(song)) {
                likedSongs.add(song); // Mark as liked
                likedOrder.offer(song); // Add to liked order
                return true; // Liked a new song
            }
        }
        return false; // No new song to like
    }
    
    public List<Song> getLikedSongsInOrder() {
        return new ArrayList<>(likedOrder); // Return the liked songs in the order they were liked
    }

    public List<Song> searchSongsByTitle(String title) {
        List<Song> foundSongs = new ArrayList<>();
        String lowerCaseTitle = title.toLowerCase();
        for (Song song : allSongs) {
            if (song.getTitle().toLowerCase().contains(lowerCaseTitle)) {
                foundSongs.add(song);
            }
        }
        return foundSongs;
    }
    

}
