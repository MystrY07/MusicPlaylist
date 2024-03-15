/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicplaylistapp;

/**
 *
 * @author aorpr
 */
public class Song {
    private String title;
    private String genre;
    
    public Song(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
    
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }
}