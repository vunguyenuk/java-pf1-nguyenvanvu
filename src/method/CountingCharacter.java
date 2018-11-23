package method;

import java.util.Scanner;

public class CountingCharacter {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Nhap vo doan ky tu: ");
        String chuoi = c.nextLine();

        demChuoi(chuoi);
    }

    public static void demChuoi(String chuoi){
        int countString = 0;
        for(int i = 0; i < chuoi.length(); i++){
            if(Character.isLetter(chuoi.charAt(i))){
                countString++;
            }
        }
        System.out.println("Do dai chuoi la: " + countString);
    }
}
