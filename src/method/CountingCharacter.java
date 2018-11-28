package method;

import java.util.Scanner;

public class CountingCharacter {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the characters: ");
        String str = c.nextLine();

        demChuoi(str);
    }

    public static void demChuoi(String chuoi){
        int countString = 0;
        for(int i = 0; i < chuoi.length(); i++){
            if(Character.isLetter(chuoi.charAt(i))){
                countString++;
            }
        }
        System.out.println("String's length: " + countString);
    }
}
