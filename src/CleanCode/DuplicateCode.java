package CleanCode;

import java.io.File;

public class DuplicateCode {
    public static void main(String[] args) {
        String filePath1 = "src";
        System.out.println("content of " + filePath1 + " is:");
        showFolder(filePath1);
    }

    public static void showFolder(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getAbsolutePath());
        }

    }
}
