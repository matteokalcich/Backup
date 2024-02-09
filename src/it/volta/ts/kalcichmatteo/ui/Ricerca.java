package it.volta.ts.kalcichmatteo.ui;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Ricerca {

    public Ricerca() {}
    
    public static JPanel ricerca() {

        JPanel pan = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, new RicercaFile().fileSearch(), new RicercaCartella().dirSearch());

        pan.add(split, FlowLayout.LEFT);

        return pan;
    }
    
}
