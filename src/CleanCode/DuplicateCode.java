package CleanCode;

import java.io.File;

public class DuplicateCode {
    public static void main(String[] args) {
        String filePath1 = "/home/vunv/Desktop";
        System.out.println("Noi dung cua " + filePath1 + " la:");
        hienThiThuMuc(filePath1);
    }

    public static void hienThiThuMuc(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getAbsolutePath());
        }

    }
}
