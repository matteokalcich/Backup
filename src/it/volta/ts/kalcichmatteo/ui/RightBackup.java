package it.volta.ts.kalcichmatteo.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RightBackup extends JPanel {

    private JButton backupButton;
    private JLabel backupLabel;
    
    public RightBackup() {

        this.setLayout(new BorderLayout());

        this.backupButton = new JButton("Backup!");
        this.backupButton.setBackground(Color.BLUE);

        this.backupButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                //JOptionPane.showMessageDialog(this);

                System.out.println("Nothing yet!");
            }
        });

        this.backupLabel = new JLabel("Area Backup");

        this.add(backupButton, BorderLayout.NORTH);
        this.add(backupLabel, BorderLayout.CENTER);
    }
}
