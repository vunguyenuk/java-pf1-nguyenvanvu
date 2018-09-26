package method;

import java.util.Scanner;


public class ChuyenDoiDoC {

    public static void fahrenheitToCelsius(double fahreheit){
        double celsius = (5.0 / 9) * (fahreheit - 32);
        System.out.println("nhiet do tu F = " + fahreheit +" sang do C = " + celsius);
    }

    public static void celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * (celsius + 32);
        System.out.println("nhiet do tu C = " + celsius +" sang do F = " + fahrenheit);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;
        int choice;

        do{
            System.out.println("==========Menu=========");
            System.out.println("Please enter your choice to convert temp");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("enter temp F = ");
                    fahrenheit = input.nextDouble();
                    fahrenheitToCelsius(fahrenheit);
                    break;
                case 2:
                    System.out.println("enter temp C = ");
                    celsius = input.nextDouble();
                    celsiusToFahrenheit(celsius);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No value is enter");
            }
        }while(choice != 0);

    }
}
