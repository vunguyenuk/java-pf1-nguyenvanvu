package Exception;

import java.io.File;

public class TestFileIO {
    public static void main(String[] args) {
        File f = new File("src/Exception/Test");
        File dir = new File("src/Exception/books");
        dir.mkdir();

        if(dir.isDirectory()){
            String[] dirContents = dir.list();

            for(int i = 0; i < dirContents.length; i++){
                System.out.println(dirContents[i]);
            }

            System.out.println(dir.getAbsolutePath());

            boolean isDeleted = f.delete() ? false : true;
            System.out.println(isDeleted);
        }
    }
}
