package event;

import business.BizBackup;
import ui.RightPanel;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HandlerButtonEvent {

    private String sourcePathFile;
    private String destinationPath;
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

    public String filePath() {

        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        fileChooser.setMultiSelectionEnabled(false);

        returnVal = fileChooser.showOpenDialog(null);

        if(returnVal == JFileChooser.APPROVE_OPTION) {

            sourcePathFile = fileChooser.getSelectedFile().toString();

            return sourcePathFile;

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

            destinationPath = fileChooser.getSelectedFile().toString();

            return destinationPath;

        } else {

            JOptionPane.showMessageDialog(null, "Nessuna cartella selezionata", "Errore", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public int getReturnVal(){

        return returnVal;
    }

    public void backup() {

        try{

            BizBackup.copyFileWithFormat(sourcePathFile, destinationPath);

        } catch(FileNotFoundException e){

            JOptionPane.showMessageDialog(null, "Impossibile leggere il file selezionato, file non esistente!", "Errore", JOptionPane.ERROR_MESSAGE);
            return;


        } catch(IOException e){

            JOptionPane.showMessageDialog(null, "Si e' verificato un errore!", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }


    }
}
