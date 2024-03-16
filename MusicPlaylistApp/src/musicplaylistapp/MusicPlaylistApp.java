/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musicplaylistapp;

/**
 *
 * @author aorpr
 */
public class MusicPlaylistApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
                javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MusicCollectionGui gui = new MusicCollectionGui(); // Initialize your main JFrame
                gui.setVisible(true); // Make the GUI visible
            }
        });
        
    }
    
}


