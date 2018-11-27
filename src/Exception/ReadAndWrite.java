package Exception;

import java.io.*;

public class ReadAndWrite {
    public static void main(String[] args) throws Exception {
        File send = new File("src/Exception/National");
        File received = new File("src/Exception/Test");
        try{
            if(received.exists()) throw new Exception("File cuoi ton tai lam on xoa no!");
            else {
                System.out.println("File cuoi da tu dong khoi tao!");
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
            System.out.println("File khong tim thay: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Loi Ngoai le: " + e.getMessage());
        }
    }
}
