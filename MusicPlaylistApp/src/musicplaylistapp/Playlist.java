/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicplaylistapp;
import java.util.Stack;

/**
 *
 * @author aorpr
 */
public class Playlist {
    private String name;
    private Stack<Song> songs;
    private boolean isRepeat;

    public Playlist(String name) {
        this.name = name;
        this.songs = new Stack<>();
        this.isRepeat = false;
    }

    public void addSong(Song song) {
        songs.push(song);
    }

    public boolean removeSong(Song song) {
        return songs.remove(song);
    }

    public void displaySongs() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }
        System.out.println("Songs in " + name + " playlist:");
        for (Song song : songs) {
            System.out.println(song.getTitle() + " - " + song.getGenre());
        }
    }

    public void setRepeat(boolean repeat) {
        isRepeat = repeat;
    }

    public int getSongCount() {
        return songs.size();
    }

    public String getName() {
        return name;
    }

    Iterable<Song> getSongs() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
