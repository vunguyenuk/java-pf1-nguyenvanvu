package Exception;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try{
            File file = new File("src/Exception/National");
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bf.readLine())!= null){
                String[] country = line.split(",");
                System.out.println(country[5]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
