package it.volta.ts.kalcichmatteo.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RightBackup {

    private static JButton backupButton;
    private static JLabel backupLabel;
    
    public JPanel paint() {

        JPanel pn = new JPanel();

        pn.setLayout(new BorderLayout());

        backupButton = new JButton("Delete!");
        backupButton.setBackground(new Color(255, 255, 255));

        backupButton.addActionListener((e) -> {

            JFileChooser jf = new JFileChooser();
            jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            jf.showSaveDialog(null);
            
            deleteAll(jf.getSelectedFile());
        });

        backupLabel = new JLabel("Area Backup");

        pn.add(backupButton, BorderLayout.NORTH);
        pn.add(backupLabel, BorderLayout.CENTER);

        return pn;
    }
    
    private void deleteAll(File directory) {
    	
    	if(directory.isDirectory()) {
    		for(File file: directory.listFiles()) 
    		    if (file.getName().contains(".bkp")) 
    		        file.delete();
    	}
    }
}
