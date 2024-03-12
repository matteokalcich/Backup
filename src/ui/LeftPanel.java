package ui;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel {

    private JLabel fileName;
    private JLabel dirName;

    private JTextField inputFileName;

    private JTextField inputDirName;
    public LeftPanel(){


        this.setLayout(new GridLayout(2, 1));

        this.add(fileComponent());

        this.add(dirComponent());
    }

    private JPanel fileComponent(){

        JPanel pan = new JPanel();

        pan.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.fileName = new JLabel("Enter file name");

        pan.add(this.fileName);

        this.inputFileName = new JTextField("<path to the file>");
        this.inputFileName.setEditable(false);

        pan.add(this.inputFileName);

        return pan;
    }

    private JPanel dirComponent() {

        JPanel pan = new JPanel();

        this.dirName = new JLabel("Enter destination directory");


        pan.add(this.dirName);

        this.inputDirName = new JTextField("<path to the directory>");
        this.inputDirName.setEditable(false);

        pan.add(this.inputDirName);

        return pan;

    }


}
