package method;

import java.util.Scanner;

public class Pentagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n = ");
        int p = input.nextInt();
        System.out.println(timSoPentagonal(p));
    }

    public static int timSoPentagonal(int n){
        int pentagonal;
        pentagonal = n * (3 * n - 1) / 2;
        return pentagonal;
    }
}
