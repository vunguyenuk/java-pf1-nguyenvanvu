package Stack;


import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class QueueDemerging {
    public static void main(String[] args) throws IOException {
        Queue<String> nu = new LinkedList <>();
        Queue<String> nam = new LinkedList <>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 4; i++){
            System.out.print("Nhap ten: ");
            String p = sc.nextLine();
            System.out.print("Gioi tinh: ");
            String sex = sc.nextLine();

            if(sex.contains("nu")){
                nu.add(p);
            }else if(sex.contains("nam")){
                nam.add(p);
            }else{
                System.out.println("Chuoi ban nhap khong hop le!");
                return;
            }
        }



        try{
            File file = new File("/home/vunv/Desktop/Test");
            FileWriter writer = new FileWriter(file);
            if(nu != null && nam != null){
                System.out.println("Nam la: " + nam);
                writer.write(String.valueOf(nu));
                System.out.println("Nu la: " + nu);
                writer.write(String.valueOf(nam));
                System.out.println("Da ghi vao file");
                writer.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
