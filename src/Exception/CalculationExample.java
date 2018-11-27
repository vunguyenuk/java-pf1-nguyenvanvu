package Exception;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();

        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculator(x, y);
    }

    public void calculator(int x, int y){
        try{
            int a = x * y;
            int b = x / y;
            int c = x + y;
            int d = x - y;
            System.out.println("Sum of x * y = " + a);
            System.out.println("Sum of x / y = " + b);
            System.out.println("Sum of x + y = " + c);
            System.out.println("Sum of x - y = " + d);
        } catch (Exception e){
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
