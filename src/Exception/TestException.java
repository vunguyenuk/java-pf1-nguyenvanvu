package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println(" Numerator: ");
            int numerator = scanner.nextInt();

            System.out.println(" Denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator/denominator;
            System.out.printf("\nResult: %d / %d = %d\n",
                    numerator, denominator, result);
        } catch (InputMismatchException e){
            System.out.println("Error is. ");
        } catch (ArithmeticException e){
            System.out.println("Arithmetic error. ");
        }

    }
}
