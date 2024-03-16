package business;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BizBackup {



    public BizBackup(){

    }


    public static void copyFileWithFormat(String sourceFilePath, String destinationFolderPath) throws IOException {
        File sourceFile = new File(sourceFilePath);
        File destinationFolder = new File(destinationFolderPath);

        if (!sourceFile.exists()) {
            throw new IOException("Il file sorgente non esiste.");
        }

        if (!destinationFolder.exists()) {
            throw new IOException("La cartella di destinazione non esiste.");
        }

        String fileName = sourceFile.getName();
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmm").format(new Date());
        String destinationFileName = fileName.substring(0, fileName.lastIndexOf(".")) + "_" + timestamp + ".bkp";
        String destinationFilePath = destinationFolderPath + File.separator + destinationFileName;

        FileInputStream inputStream = new FileInputStream(sourceFile);
        FileOutputStream outputStream = new FileOutputStream(destinationFilePath);

        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length);
        }

        inputStream.close();
        outputStream.close();
    }



}
