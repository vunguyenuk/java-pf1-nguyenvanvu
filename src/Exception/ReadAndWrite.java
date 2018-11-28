package Exception;

import java.io.*;

public class ReadAndWrite {
    public static void main(String[] args) throws Exception {
        File send = new File("src/Exception/National");
        File received = new File("src/Exception/Test");
        try{
            if(received.exists()) throw new Exception("The receive file is exists. Please remove it!");
            else {
                System.out.println("Last File is initial!");
                BufferedReader read = new BufferedReader(new FileReader(send));
                BufferedWriter writer = new BufferedWriter(new FileWriter(received));
                String line = "";
                while ((line = read.readLine()) != null){
                    System.out.println("Writer is done!");
                    writer.write(line + "\n" + line.length());
                }
                try{
                    writer.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception error: " + e.getMessage());
        }
    }
}
