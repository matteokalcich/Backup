package it.volta.ts.kalcichmatteo.ui;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RicercaFile extends JPanel {

	private JLabel filename;
	private JTextArea filepath;
	
	private static final long serialVersionUID = 1L;

	
	public RicercaFile() {
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		filename = new JLabel("Inserisci nome file");
		this.add(filename);
		
		filepath = new JTextArea("<path file>");
		this.add(filepath);
	}
}
