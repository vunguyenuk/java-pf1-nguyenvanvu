package FileAndSerialization;

import java.io.*;

public class CopyFileBinary {
    public static void copyFile(File source, File dest) throws Exception{
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try{
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest);
            System.out.println(fis);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] bytes = new byte[1024];
            int leng;
            while ((leng = bis.read(bytes)) != -1){
                bos.write(bytes, 0, leng);
            }
        }finally {
            bis.close();
            bos.close();
        }
    }

    public static void main(String[] args) throws Exception {
        String source = "src/FileAndSerialization/SourceFile";
        String dest = "src/FileAndSerialization/DestFile";

        File sourceFile = new File(source);
        File destFile = new File(dest);

        try{
            if(destFile.exists()) throw new Exception("The Last File is exists. Please remove it");
            else {
                System.out.println("Last file is initial");
                copyFile(sourceFile, destFile);
                System.out.println("File is copy!");
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch (IOException e){
            System.out.println("Exception error: " + e.getMessage());
        }
    }
}
