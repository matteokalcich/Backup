package it.volta.ts.kalcichmatteo.ui;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Ricerca {
    
    private RicercaCartella rc = new RicercaCartella();
    private RicercaFile rf = new RicercaFile();

    public JPanel ricerca() {

        JPanel pan = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, rf.fileSearch(), rc.dirSearch());

        pan.add(split, FlowLayout.LEFT);

        return pan;
    }

    public void creaFile() {

        creaFile(rc, rf);
    }

    private void creaFile(RicercaCartella rc, RicercaFile rf) {

        new Backup();
        Backup.creaFile(rf, rc);
    }
    
    
}
