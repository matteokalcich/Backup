package it.volta.ts.kalcichmatteo.ui;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Ricerca {

    public Ricerca() {}

    public static JSplitPane ricerca() {

        JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, new RicercaFile().fileSearch(), new RicercaCartella().dirSearch());

        return split;
    }
    
}
