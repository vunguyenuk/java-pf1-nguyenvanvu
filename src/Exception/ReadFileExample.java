package Exception;

import java.io.*;

public class ReadFileExample {
    public void readFileText(){
        try{
            File file = new File("src/Exception/numbers");

            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum is: " + sum);
        } catch (Exception e) {
            System.out.println("Exception Error: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText();
    }
}
