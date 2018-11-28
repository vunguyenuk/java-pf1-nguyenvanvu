package method;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = ip.nextInt();

        if(isPrime(n)){
            System.out.println("is the prime number!");
        }else {
            System.out.println(n + "is not a prime number ");
        }
    }

    public static boolean isPrime(int n) {
        if(n < 2){
            return false;
        }

        for(int i = 2; i <= n - 1; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
