package method;

import java.util.Scanner;

public class SortDecrementPrime {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("enter the numbers in turn: ");
        double number1 = ip.nextDouble();
        double number2 = ip.nextDouble();
        double number3 = ip.nextDouble();
        displaySortedNumbers(number1, number2, number3);
    }

    public static void displaySortedNumbers(double n1, double n2, double n3){
        double temp;

        if(n2 > n1 && n2 > n3){
            temp = n1;
            n1 = n2;
            n2 = temp;

        } else if(n3 > n1 && n3 > n2){
            temp = n1;
            n1 = n3;
            n3 = temp;
        }

        if(n3 > n2) {
            temp = n2;
            n2 = n3;
            n3 = temp;
        }
        System.out.println("number 1 = " + n1 + " number 2 = " + n2 + " number 3 = " + n3);
    }
}
