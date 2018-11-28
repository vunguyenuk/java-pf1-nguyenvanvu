package FileAndSerialization;

import java.io.*;

public class ManagermentProduct {
    public static void addProduct(File source, String str) throws Exception {
        PrintWriter pw = null;
        try{
          pw = new PrintWriter(new FileOutputStream(source), true);
          pw.append(str);
        } finally {
            pw.close();
        }
    }

    public static void copySourceToDestination(File soure, File dest) throws Exception{
        FileInputStream is = null;
        FileOutputStream os = null;
        try{
            is = new FileInputStream(soure);
            os = new FileOutputStream(dest);
            byte[] bytes = new byte[1024];
            int line;
            while ((line = is.read(bytes)) > 0){
                os.write(bytes, 0, line);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        String sourcePath = "src/FileAndSerialization/TestInput";
        String destPath = "src/FileAndSerialization/TestOutput";
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