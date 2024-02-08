package it.volta.ts.kalcichmatteo.ui;

import java.awt.BorderLayout;

import javax.swing.*;

public class Schermata extends JFrame {

	private static final long serialVersionUID = 1L;

	public Schermata() {
		
		super("Backup");
		this.setLayout(new BorderLayout());
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(new Logo(), BorderLayout.NORTH);
		//this.add(new RicercaFile(), BorderLayout.WEST);
		//this.add(new RicercaCartella(), BorderLayout.SOUTH);
		this.add(Ricerca.ricerca(), BorderLayout.WEST);
		this.setLocationRelativeTo(null);
		//this.pack();
		this.setVisible(true);
	}
}
