package ui;

import event.HandlerButtonEvent;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottomPanel extends JPanel implements ActionListener {

    private final HandlerButtonEvent event;

    public BottomPanel(){

        event = HandlerButtonEvent.createInstance();

        this.setLayout(new BorderLayout());

        JButton backupBtn = new JButton("Backup");

        backupBtn.addActionListener(this);
        this.add(backupBtn, BorderLayout.NORTH);

        this.add(new JLabel("<html><em>Disclaimer! Tutti i dirtti d'autore sono riservati.</em></html>"), BorderLayout.WEST);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equalsIgnoreCase("Backup")){

            event.backup();
        }
    }
}
