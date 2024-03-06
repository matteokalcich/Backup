package it.volta.ts.kalcichmatteo.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RicercaFile extends JPanel {

	private JLabel filename;
	private JLabel filepath;
	private JButton fileChooserButton;
	private int returnVal;
	private JFileChooser fileChooser;
	
	private static final long serialVersionUID = 1L;

	public JPanel fileSearch() {

		this.setLayout(new BorderLayout());

		
		filename = new JLabel("Enter file name");

		this.add(filename, BorderLayout.NORTH);
		
		filepath = new JLabel("<path to the file>");
		filepath.setMinimumSize(new Dimension(100, 100));
		this.add(filepath, BorderLayout.WEST);

		fileChooserButton = new JButton("Cerca File");

        fileChooserButton.addActionListener((e) -> {
        	
        	fileChooser = new JFileChooser();

			fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

			returnVal = fileChooser.showOpenDialog(this);

			file();	

        });

		this.add(fileChooserButton, BorderLayout.EAST);

		return this;
	}

	public File file() {

		if(returnVal == JFileChooser.APPROVE_OPTION) {

			File path=fileChooser.getSelectedFile();
			filepath.setText(fileChooser.getSelectedFile().toString());
			return path;

		} else {

			return null;
		}


	}
}
