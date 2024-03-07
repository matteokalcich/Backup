package it.volta.ts.kalcichmatteo.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RicercaCartella extends JPanel {

	private JLabel filename;
	private JTextField filepath;
	private JButton fileChooserButton;
	private JFileChooser fileChooser;
	
	private static final long serialVersionUID = 1L;

	
	public RicercaCartella() {
		
		dirSearch();
	}

	public JPanel dirSearch() {

		this.setLayout(new BorderLayout());

		filename = new JLabel("Enter destination folder");

		this.add(filename, BorderLayout.NORTH);
		
		filepath = new JTextField("<path destination folder>");
		filepath.setEditable(false);
		filepath.setMinimumSize(new Dimension(100, 100));
		this.add(filepath, BorderLayout.WEST);

		fileChooserButton = new JButton("Search folder");

        fileChooserButton.addActionListener((e) -> {
            
        	fileChooser = new JFileChooser();	
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        	fileChooser.showSaveDialog(null);

			pathDir();
            
        });

		this.add(fileChooserButton, BorderLayout.EAST);

		return this;

	}

	public String pathDir() {

		filepath.setText(fileChooser.getSelectedFile().toString());

		return fileChooser.getSelectedFile().toString();

	}
}
