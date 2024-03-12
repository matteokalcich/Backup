package boundary;

import ui.MainPanel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BackupUI extends JFrame {

    public void startGUI() {

        this.setTitle("Backup");

        int HEIGHT = 600;
        int WIDTH = 800;

        this.setSize(WIDTH, HEIGHT);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLocationRelativeTo(null);

        this.add(new MainPanel());

        this.setVisible(true);
    }
}
