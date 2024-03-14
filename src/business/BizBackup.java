package business;

import java.io.File;
import java.io.IOException;

public class BizBackup {

    public BizBackup(){

    }
    public static void creaFile(String pth, File f) {

        String path = pth;

        File file = f;

        String fileName = file.getName();
        String[] data = fileName.split("\\.");
        data[1] = ".bkp";

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

    private static void deleteFile(String path) {


        File f = new File(path);

        f.delete();
    }

}
