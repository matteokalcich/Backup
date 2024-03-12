package ui;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {

    private JButton deleteBtn;

    private JLabel lb;

    public RightPanel() {

        this.setLayout(new BorderLayout());

        deleteBtn = new JButton("Delete!");

        this.add(deleteBtn, BorderLayout.NORTH);

        this.lb = new JLabel();

        this.lb.setText("Non so cosa fare");

        this.add(lb, BorderLayout.CENTER);
    }


}


