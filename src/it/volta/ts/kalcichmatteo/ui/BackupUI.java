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
		Ricerca ricerca = new Ricerca();
		this.add(ricerca.ricerca(), BorderLayout.WEST);
		RightBackup rb = new RightBackup();
		this.add(rb.paint(), BorderLayout.AFTER_LINE_ENDS);
		JButton backup = new JButton("Backup");
		this.add(backup, BorderLayout.PAGE_END);
		backup.addActionListener((e) -> {

			ricerca.creaFile();
		});
		this.setLocationRelativeTo(null);
		//this.pack();
		this.setVisible(true);
	}
}
