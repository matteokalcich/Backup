package it.volta.ts.kalcichmatteo.ui;

import java.awt.*;

import javax.swing.*;

public class Schermata extends JFrame {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("static-access")
	public Schermata() {
		
		super("Backup");
		this.setLayout(new BorderLayout());
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(new Logo(), BorderLayout.PAGE_START);
		this.add(new JLabel("Benvenuti"), BorderLayout.AFTER_LINE_ENDS);
		//this.add(new Welcome(), BorderLayout.NORTH);
		this.add(Ricerca.ricerca(), BorderLayout.WEST);
		this.setLocationRelativeTo(null);
		//this.pack();
		this.setVisible(true);
	}
}
