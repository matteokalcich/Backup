package event;

import business.BizBackup;

import javax.swing.*;
import java.io.File;

public class HandlerButtonEvent {

    private String path;
    private File file;
    private int returnVal;
    private static HandlerButtonEvent event;

    public static HandlerButtonEvent createInstance(){

        if(event == null){

            event = new HandlerButtonEvent();

            return event;


        } else {

            return event;
        }
    }

    public String filePath(){

        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        fileChooser.setMultiSelectionEnabled(false);

        returnVal = fileChooser.showOpenDialog(null);

        if(returnVal == JFileChooser.APPROVE_OPTION) {

            file = fileChooser.getSelectedFile();

            return fileChooser.getSelectedFile().toString();

        } else {

            JOptionPane.showMessageDialog(null, "Nessun file selezionato", "Errore", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String dirPath(){

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        fileChooser.setMultiSelectionEnabled(false);

        returnVal = fileChooser.showOpenDialog(null);

        if(returnVal == JFileChooser.APPROVE_OPTION) {

            path = fileChooser.getSelectedFile().toString();

            return fileChooser.getSelectedFile().toString();

        } else {

            JOptionPane.showMessageDialog(null, "Nessuna cartella selezionata", "Errore", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public int getReturnVal(){

        return returnVal;
    }

    public void backup() {

        BizBackup.creaFile(path, file);
    }
}
