package it.volta.ts.kalcichmatteo.ui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RicercaCartella extends JPanel {

	private JLabel filename;
	private JTextField filepath;
	private JButton fileChooserButton;
	
	private static final long serialVersionUID = 1L;

	
	public RicercaCartella() {
		
		dirSearch();
	}

	public JPanel dirSearch() {

		this.setLayout(new BorderLayout());

		
		filename = new JLabel("Enter destination folder");

		this.add(filename, BorderLayout.NORTH);
		
		filepath = new JTextField("<path destination folder>");
		this.add(filepath, BorderLayout.WEST);

		fileChooserButton = new JButton("Search folder");

        fileChooserButton.addActionListener((e) -> {
            
			new JFileChooser();
        });

		this.add(fileChooserButton, BorderLayout.EAST);

		return this;

	}
}
