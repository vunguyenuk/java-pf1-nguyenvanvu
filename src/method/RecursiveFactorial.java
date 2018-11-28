package method;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        recursiveRecursion(n);
    }

    public static int recursiveRecursion(int n){
        if(n == 0)
            return  1;
        return n * recursiveRecursion(n-1);
    }
}
