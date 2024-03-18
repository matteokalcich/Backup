package ui;

import javax.swing.*;

import business.BizBackup;

import java.awt.*;

public class RightPanel extends JPanel {

    private JButton deleteBtn;

    private JLabel lb;

    public RightPanel() {

        this.setLayout(new BorderLayout());

        this.deleteBtn = new JButton("Delete!");

        this.add(deleteBtn, BorderLayout.NORTH);

        this.lb = new JLabel("Ciao");

        this.add(lb, BorderLayout.CENTER);
    }


}


