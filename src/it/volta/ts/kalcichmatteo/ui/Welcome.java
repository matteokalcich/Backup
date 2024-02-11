package it.volta.ts.kalcichmatteo.ui;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcome extends JPanel {

    private JLabel welcome;

    public Welcome() {

        welcome = new JLabel("Benvenuto");

        this.add(welcome);        
    }
    
}
