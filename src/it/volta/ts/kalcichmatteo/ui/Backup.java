package it.volta.ts.kalcichmatteo.ui;

import java.io.File;
import java.io.IOException;

public class Backup {

    public static void creaFile(RicercaFile rf, RicercaCartella rc) {

        String path = rc.pathDir();
        File file = rf.file();

        String fileName = file.getName();
        String[] data = fileName.split("\\.");
        data[1] = ".bck";

        String newFileName = data[0] + data[1];

        File bckFile = new File(path + File.separator + newFileName);

        try {

            if(!bckFile.createNewFile()) {

                bckFile.delete();
                bckFile.createNewFile();
            }

        } catch (IOException e) {
            
            e.printStackTrace();
        }

    }    

    public static void deleteFile(String path) {


        File f = new File(path);

        f.delete();
    }
}
