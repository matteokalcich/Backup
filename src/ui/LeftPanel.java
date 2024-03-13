package ui;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeftPanel extends JPanel implements ActionListener {

    private JLabel fileName;
    private JLabel dirName;

    private JTextField inputFileName;

    private JTextField inputDirName;
    public LeftPanel(){


        this.setLayout(new GridLayout(2, 1));

        JButton dirBtn = new JButton("Cerca directory");
        this.add(fileComponent());

        dirBtn.addActionListener(this);

        this.add(dirComponent());

        this.add(dirBtn);
    }

    private JPanel fileComponent(){

        JPanel pan = new JPanel();

        pan.setLayout(new FlowLayout());

        this.fileName = new JLabel("Enter file name");

        pan.add(this.fileName);

        this.inputFileName = new JTextField("<path to the file>");
        this.inputFileName.setEditable(false);

        pan.add(this.inputFileName);

        JButton fileBtn = new JButton("Cerca file");
        this.add(fileBtn);
        fileBtn.addActionListener(this);

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


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equalsIgnoreCase("Cerca File")){

            JOptionPane.showMessageDialog(this, "Cerca File", "ERRORE", JOptionPane.ERROR_MESSAGE);
        } else{

            JOptionPane.showMessageDialog(this, "Cerca Dir", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }

    }
}
