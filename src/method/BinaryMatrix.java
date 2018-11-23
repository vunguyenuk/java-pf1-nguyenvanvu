package method;

import java.util.Scanner;

public class BinaryMatrix {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap so hang so cot: ");
        int n = ip.nextInt();

        maTranNhiPhan(n);
    }

    public static void maTranNhiPhan(int n){
        for(int rows = 0; rows < n; rows++){
            for(int cols = 0; cols < n; cols++){
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}
