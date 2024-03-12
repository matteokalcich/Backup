package ui;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TopPanel extends JPanel {

    public TopPanel(){

        this.setBorder(new EmptyBorder(5, 5, 5, 5));

        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        BufferedImage myPicture = null;

        try {

            myPicture = ImageIO.read(new File("resources" + File.separator + "Logo.jpg"));

        } catch (IOException e) {

            e.printStackTrace();
        }

        this.add(new JLabel(new ImageIcon(myPicture)));
    }

}
