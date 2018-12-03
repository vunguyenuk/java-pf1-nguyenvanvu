package IO;

import java.io.*;

public class ManagermentProduct {
    public static void addProduct(File source, String str) throws Exception {
        PrintWriter pw = null;
        try{
          pw = new PrintWriter(new FileOutputStream(source), true);
          pw.write(str);
        } finally {
            pw.close();
        }
    }

    public static void copySourceToDestination(File soure, File dest) throws Exception{
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream(soure);
            fos = new FileOutputStream(dest);
            byte[] bytes = new byte[1024];
            int line;
            while ((line = fis.read(bytes)) > 0){
                fos.write(bytes, 0, line);
            }
        } finally {
            fis.close();
            fos.close();
        }
    }

    public static void main(String[] args) {
        String sourcePath = "src/IO/TestInput";
        String destPath = "src/IO/TestOutput";
        String str = "nameProduct: \"orange\", quantity: 120;\n" +
                    "nameProduct: \"grape\", quantity: 123;\n" +
                    "nameProduct: \"tangerines\", quantity: 121; \n" +
                    "nameProduct: \"watermelon\", quantity: 150;\n";
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            addProduct(sourceFile,str);
            System.out.println("Write is done!");

            copySourceToDestination(sourceFile, destFile);
            System.out.println("Copy file is done!");
        }catch (IOException e){
            System.out.println("Can't copy: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Can't write: " + e.getMessage());
        }
    }
}