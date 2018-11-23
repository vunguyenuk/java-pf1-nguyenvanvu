package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CalTotalElementOnMainDiagonal {
    public static void main(String[] args) {
        int soDong, soCot, Sum = 0;


        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao so dong cua mang: ");
        soDong = input.nextInt();

        System.out.println("Nhap vao so cot cua mang: ");
        soCot = input.nextInt();

        int[][] matrix = new int[soDong][soCot];


        System.out.println("mang vua nhap: ");
        for (int i = 0; i < soDong; i++){
            for(int j = 0; j < soCot; j++) {
                System.out.print("Nhap phan thu thu [" + i + ", " + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("tinh tong ham cheo cua ma tran");
        for (int i = 0; i < soCot; i++ ){
            Sum += matrix[i][i];
        }
        System.out.println("tong la: " + Sum);
    }
}