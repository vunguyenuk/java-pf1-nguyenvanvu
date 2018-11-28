package Stack;


import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class QueueDemerging {
    public static void main(String[] args) throws IOException {
        Queue<String> female = new LinkedList <>();
        Queue<String> male = new LinkedList <>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 4; i++){
            System.out.print("Enter your name's: ");
            String p = sc.nextLine();
            System.out.print("Enter your sex's: ");
            String sex = sc.nextLine();

            if(sex.contains("female")){
                female.add(p);
            }else if(sex.contains("male")){
                male.add(p);
            }else{
                System.out.println("Your String is invalid!");
                return;
            }
        }



        try{
            File file = new File("/home/vunv/Desktop/Test");
            FileWriter writer = new FileWriter(file);
            if(female != null && male != null){
                System.out.println("male is: " + male);
                writer.write(String.valueOf(female));
                System.out.println("female is: " + female);
                writer.write(String.valueOf(male));
                System.out.println("File is write");
                writer.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
