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

    public MusicCollection() {
        this.likedSongs = new ArrayDeque<>();
        this.genrePlaylists = new ArrayList<>();
        this.allSongs = new ArrayList<>();
        this.popSongs = new ArrayList<>();
        this.rapSongs = new ArrayList<>();
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

    public void addSongToLiked(Song song) {
        likedSongs.add(song); // Stack operation, adding song to the "liked" playlist
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


    

}
