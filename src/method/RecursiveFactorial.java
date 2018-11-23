package method;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        giaiThuaDeQuy(n);
    }

    public static int giaiThuaDeQuy(int n){
        if(n == 0)
            return  1;
        return n * giaiThuaDeQuy(n-1);
    }
}
