package ui;

import event.HandlerButtonEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeftPanel extends JPanel implements ActionListener {

    private final HandlerButtonEvent evento;

    private JTextField inputFileName;

    private JTextField inputDirName;
    public LeftPanel(){

        evento = HandlerButtonEvent.createInstance();

        this.setLayout(new GridLayout(3, 1));

        JLabel benvenuto = new JLabel("<html><em>Ciao, benvenuto nel programma di backup</em><br></br></html>");

        this.add(benvenuto);

        JSplitPane pan = new JSplitPane(JSplitPane.VERTICAL_SPLIT, fileComponent(), dirComponent());

        this.add(pan);


    }

    private JPanel fileComponent(){

        JPanel pan = new JPanel();

        pan.setLayout(new BorderLayout());

        JLabel fileName = new JLabel("Enter file name");

        pan.add(fileName, BorderLayout.NORTH);

        this.inputFileName = new JTextField("<path to the file>");
        this.inputFileName.setEditable(false);

        pan.add(this.inputFileName, BorderLayout.CENTER);

        JButton fileBtn = new JButton("Cerca file");
        pan.add(fileBtn, BorderLayout.EAST);
        fileBtn.addActionListener(this);

        return pan;
    }

    private JPanel dirComponent() {

        JPanel pan = new JPanel();

        pan.setLayout(new BorderLayout());

        JLabel dirName = new JLabel("Enter destination directory");

        pan.add(dirName, BorderLayout.NORTH);

        this.inputDirName = new JTextField("<path to the directory>");
        this.inputDirName.setEditable(false);

        pan.add(this.inputDirName, BorderLayout.CENTER);

        JButton dirBtn = new JButton("Cerca Directory");
        dirBtn.addActionListener(this);

        pan.add(dirBtn, BorderLayout.EAST);

        return pan;

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equalsIgnoreCase("Cerca File")){

            inputFileName.setText(evento.filePath());

        } else if(e.getActionCommand().equalsIgnoreCase("Cerca Directory")){

            inputDirName.setText(evento.dirPath());
        }

    }
}
