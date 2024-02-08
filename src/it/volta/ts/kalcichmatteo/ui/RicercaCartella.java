package it.volta.ts.kalcichmatteo.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RicercaCartella extends JPanel {

	private JLabel filename;
	private JTextField filepath;
	private JButton fileChooserButton;
	private JLabel fileField;
	
	private static final long serialVersionUID = 1L;

	
	public RicercaCartella() {
		
		this.setLayout(new BorderLayout());

		
		filename = new JLabel("Enter destination folder	");

		this.add(filename, BorderLayout.NORTH);
		
		filepath = new JTextField("<path destination folder>");
		this.add(filepath, BorderLayout.WEST);

		fileField = new JLabel();

        this.add(fileField, BorderLayout.CENTER);

		fileChooserButton = new JButton("Search folder");

        fileChooserButton.addActionListener((e) -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                fileField.setText(fileChooser.getSelectedFile().getAbsolutePath());
            }
        });

		this.add(fileChooserButton, BorderLayout.EAST);

		

	}

	public JPanel dirSearch() {

		this.setLayout(new BorderLayout());

		
		filename = new JLabel("Enter destination folder	");

		this.add(filename, BorderLayout.NORTH);
		
		filepath = new JTextField("<path destination folder>");
		this.add(filepath, BorderLayout.WEST);

		fileField = new JLabel();

        this.add(fileField, BorderLayout.CENTER);

		fileChooserButton = new JButton("Search folder");

        fileChooserButton.addActionListener((e) -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                fileField.setText(fileChooser.getSelectedFile().getAbsolutePath());
            }
        });

		this.add(fileChooserButton, BorderLayout.EAST);

		return this;

	}
}
