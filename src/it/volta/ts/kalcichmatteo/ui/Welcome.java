package it.volta.ts.kalcichmatteo.ui;

import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcome extends JPanel {

    private JLabel welcome;

    @SuppressWarnings("static-access")
    public Welcome(BorderLayout layout) {

        this.setLayout(layout);

        welcome = new JLabel("Benvenuto");

        this.add(welcome, layout.);        
    }
    
}
