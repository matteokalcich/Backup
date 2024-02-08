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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RicercaFile extends JPanel {

	private JLabel filename;
	private JTextField filepath;
	private JButton fileChooserButton;
	private JLabel fileField;
	
	private static final long serialVersionUID = 1L;

	
	public RicercaFile() {
		
		this.setLayout(new BorderLayout());

		
		filename = new JLabel("Enter file name");

		this.add(filename, BorderLayout.NORTH);
		
		filepath = new JTextField("<path file>");
		this.add(filepath, BorderLayout.WEST);

		fileField = new JLabel();

        this.add(fileField, BorderLayout.CENTER);

		fileChooserButton = new JButton("Cerca File");

        fileChooserButton.addActionListener((e) -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                fileField.setText(fileChooser.getSelectedFile().getAbsolutePath());
            }
        });

		this.add(fileChooserButton, BorderLayout.EAST);

	}

	public JPanel fileSearch() {

		this.setLayout(new BorderLayout());

		
		filename = new JLabel("Enter file name");

		this.add(filename, BorderLayout.NORTH);
		
		filepath = new JTextField("<path file>");
		this.add(filepath, BorderLayout.WEST);

		fileField = new JLabel();

        this.add(fileField, BorderLayout.CENTER);

		fileChooserButton = new JButton("Cerca File");

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