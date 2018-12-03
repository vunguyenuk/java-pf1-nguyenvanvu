package Threading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public void copyFileUsing7File(File source, File dest) throws Exception{
            Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public void copyFileStandard(File source, File dest) throws Exception{
        FileInputStream is = null;
        FileOutputStream os = null;
        try{
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] bytes = new byte[1028];
            int line;
            while ((line = is.read(bytes)) != -1){
                os.write(bytes, 0, line);
            }
        }finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        String sourcePath = "src/Threading/SourceFile";
        String destPath = "src/Threading/DestinationFile";
        CopyFile copyFile = new CopyFile();
        try{
            File fileSoure = new File(sourcePath);
            File fileDest = new File(destPath);
            copyFile.copyFileStandard(fileSoure, fileDest);
            System.out.println("Copy file 1 is success");
            copyFile.copyFileUsing7File(fileDest, fileSoure);
            System.out.println("Copy file 2 is success");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
