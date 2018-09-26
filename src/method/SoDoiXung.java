package method;

import java.util.Scanner;

public class SoDoiXung {
    public static void main(String[] args) {
        int reverse = 0, lastDigit, number, initialNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so de chia: ");
        number = sc.nextInt();
        initialNumber = number;
        while (number != 0){
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            System.out.println("reverse: " + reverse + " --- initial number remain: " + number);
            number = number / 10;
        }
        if(reverse == initialNumber){
            System.out.print("So doi xung la: " + initialNumber);
        } else {
            System.out.println("khong phai so doi xung");
        }

    }


}
