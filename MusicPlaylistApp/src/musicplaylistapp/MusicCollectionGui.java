/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package musicplaylistapp;

/**
 *
 * @author aorpr
 */
public class MusicCollectionGui extends javax.swing.JFrame {

    /**
     * Creates new form MusicCollectionGui
     */
    public MusicCollectionGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        songManagementPanel = new javax.swing.JPanel();
        songTitleTextField = new javax.swing.JTextField();
        addSongButton = new javax.swing.JButton();
        likeSongButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        searchSongButton = new javax.swing.JButton();
        displayPanel = new javax.swing.JPanel();
        displayScrollPane = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextPane();
        songCounterLabel = new javax.swing.JLabel();
        playlistManagementPanel = new javax.swing.JPanel();
        addToPopButton = new javax.swing.JButton();
        removeFromPopButton = new javax.swing.JButton();
        showPopPlaylistButton = new javax.swing.JButton();
        addToRapButton = new javax.swing.JButton();
        removeFromRapButton = new javax.swing.JButton();
        showRapPlaylistButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        songManagementPanel.setBackground(new java.awt.Color(153, 153, 153));

        songTitleTextField.setText("Enter song name here");
        songTitleTextField.setToolTipText("");
        songTitleTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        songTitleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songTitleTextFieldActionPerformed(evt);
            }
        });

        addSongButton.setText("Add Song To List");
        addSongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSongButtonActionPerformed(evt);
            }
        });

        likeSongButton.setText("Add recent song to liked");
        likeSongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likeSongButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Show liked songs");

        searchSongButton.setText("Search");

        javax.swing.GroupLayout songManagementPanelLayout = new javax.swing.GroupLayout(songManagementPanel);
        songManagementPanel.setLayout(songManagementPanelLayout);
        songManagementPanelLayout.setHorizontalGroup(
            songManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songManagementPanelLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(songManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(songManagementPanelLayout.createSequentialGroup()
                        .addComponent(likeSongButton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(songTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(songManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addSongButton, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(searchSongButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        songManagementPanelLayout.setVerticalGroup(
            songManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songManagementPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(songManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(songTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSongButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(songManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(likeSongButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchSongButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        displayPanel.setBackground(new java.awt.Color(153, 153, 153));

        displayScrollPane.setBackground(new java.awt.Color(102, 102, 102));

        displayArea.setEditable(false);
        displayScrollPane.setViewportView(displayArea);

        songCounterLabel.setBackground(new java.awt.Color(204, 153, 0));
        songCounterLabel.setForeground(new java.awt.Color(0, 0, 0));
        songCounterLabel.setText("Number of Songs: ");

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayScrollPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(songCounterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayScrollPane)
                .addContainerGap())
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(songCounterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        playlistManagementPanel.setBackground(new java.awt.Color(153, 153, 153));

        addToPopButton.setBackground(new java.awt.Color(51, 51, 255));
        addToPopButton.setText("Add to Pop Playlist");

        removeFromPopButton.setBackground(new java.awt.Color(51, 51, 255));
        removeFromPopButton.setText("Remove from Pop Playlist");
        removeFromPopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromPopButtonActionPerformed(evt);
            }
        });

        showPopPlaylistButton.setBackground(new java.awt.Color(51, 51, 255));
        showPopPlaylistButton.setText("Show Pop Playlist");

        addToRapButton.setBackground(new java.awt.Color(153, 0, 0));
        addToRapButton.setText("Add to Rap Playlist");

        removeFromRapButton.setBackground(new java.awt.Color(153, 0, 0));
        removeFromRapButton.setText("Remove from Rap Playlist");

        showRapPlaylistButton.setBackground(new java.awt.Color(153, 0, 0));
        showRapPlaylistButton.setText("Show Rap Playlist");

        javax.swing.GroupLayout playlistManagementPanelLayout = new javax.swing.GroupLayout(playlistManagementPanel);
        playlistManagementPanel.setLayout(playlistManagementPanelLayout);
        playlistManagementPanelLayout.setHorizontalGroup(
            playlistManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistManagementPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(playlistManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addToRapButton, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(addToPopButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(playlistManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeFromPopButton, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(removeFromRapButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(playlistManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(showPopPlaylistButton, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(showRapPlaylistButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        playlistManagementPanelLayout.setVerticalGroup(
            playlistManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistManagementPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(playlistManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeFromPopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPopPlaylistButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addToPopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(playlistManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeFromRapButton, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(showRapPlaylistButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addToRapButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(playlistManagementPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(songManagementPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(songManagementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(playlistManagementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void songTitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songTitleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songTitleTextFieldActionPerformed

    private void addSongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSongButtonActionPerformed

    }//GEN-LAST:event_addSongButtonActionPerformed

    private void likeSongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_likeSongButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_likeSongButtonActionPerformed

    private void removeFromPopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromPopButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeFromPopButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusicCollectionGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicCollectionGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicCollectionGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicCollectionGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicCollectionGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSongButton;
    private javax.swing.JButton addToPopButton;
    private javax.swing.JButton addToRapButton;
    private javax.swing.JTextPane displayArea;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JScrollPane displayScrollPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton likeSongButton;
    private javax.swing.JPanel playlistManagementPanel;
    private javax.swing.JButton removeFromPopButton;
    private javax.swing.JButton removeFromRapButton;
    private javax.swing.JButton searchSongButton;
    private javax.swing.JButton showPopPlaylistButton;
    private javax.swing.JButton showRapPlaylistButton;
    private javax.swing.JLabel songCounterLabel;
    private javax.swing.JPanel songManagementPanel;
    private javax.swing.JTextField songTitleTextField;
    // End of variables declaration//GEN-END:variables
}