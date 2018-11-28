package method;

import java.util.Scanner;

public class SynmmetricalNumber {
    public static void main(String[] args) {
        int reverse = 0, lastDigit, number, initialNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to divide: ");
        number = sc.nextInt();
        initialNumber = number;
        while (number != 0){
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            System.out.println("reverse: " + reverse + " --- initial number remain: " + number);
            number = number / 10;
        }
        if(reverse == initialNumber){
            System.out.print("Symmetry is: " + initialNumber);
        } else {
            System.out.println("is not Symmetry");
        }

    }


}
