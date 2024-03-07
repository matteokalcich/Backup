package it.volta.ts.kalcichmatteo.ui;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Logo extends JPanel {

	/**
	 * This class create the logo from the file logo.jpg in the project folder
	 */
	private static final long serialVersionUID = 1L;

	public Logo() {
		
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		BufferedImage myPicture = null;
		
		try {
			
			myPicture = ImageIO.read(new File("Logo.jpg"));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		this.add(new JLabel(new ImageIcon(myPicture)));
		

	}
}
