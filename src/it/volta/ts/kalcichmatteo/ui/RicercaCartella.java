package it.volta.ts.kalcichmatteo.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RicercaCartella extends JPanel {

	private JLabel filename;
	private JLabel filepath;
	private JButton fileChooserButton;
	
	private static final long serialVersionUID = 1L;

	
	public RicercaCartella() {
		
		dirSearch();
	}

	public JPanel dirSearch() {

		this.setLayout(new BorderLayout());

		filename = new JLabel("Enter destination folder");

		this.add(filename, BorderLayout.NORTH);
		
		filepath = new JLabel("<path destination folder>");
		filepath.setMinimumSize(new Dimension(100, 100));
		this.add(filepath, BorderLayout.WEST);

		fileChooserButton = new JButton("Search folder");

        fileChooserButton.addActionListener((e) -> {
            
        	JFileChooser fileChooser = new JFileChooser();
            
        	fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int response = fileChooser.showOpenDialog(null);
            
        });

		this.add(fileChooserButton, BorderLayout.EAST);

		return this;

	}
}
