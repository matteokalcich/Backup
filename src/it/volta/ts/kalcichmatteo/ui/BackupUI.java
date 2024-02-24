package it.volta.ts.kalcichmatteo.ui;

import java.awt.*;

import javax.swing.*;

public class BackupUI extends JFrame {

	private static final long serialVersionUID = 1L;

	public BackupUI() {
		
		super("Backup");
		this.setLayout(new BorderLayout());
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(new Logo(), BorderLayout.NORTH);
		//this.add(new JLabel("Benvenuti"), BorderLayout.AFTER_LINE_ENDS);
		//this.add(new Welcome(), BorderLayout.NORTH);
		this.add(Ricerca.ricerca(), BorderLayout.WEST);
		this.add(new RightBackup(), BorderLayout.AFTER_LINE_ENDS);
		this.setLocationRelativeTo(null);
		//this.pack();
		this.setVisible(true);
	}
}
