package method;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap 1 so bat ky: ");
        int n = ip.nextInt();

        if(isPrime(n)){
            System.out.println("La so nguyen to!");
        }else {
            System.out.println(n + " khong phai la so nguyen to ");
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
