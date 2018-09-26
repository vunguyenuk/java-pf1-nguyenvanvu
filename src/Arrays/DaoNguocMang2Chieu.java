package Arrays;

import java.util.Scanner;

public class DaoNguocMang2Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your row: ");
        int rows = input.nextInt();

        System.out.print("Enter your col: ");
        int columns = input.nextInt();

        int[][] data = new int[rows][columns];

        for(int i = 0; i < rows; i++ ){
            for(int j = 0; j < columns; j++){
                System.out.print("Nhap hang va cot: data[" + i + "][" + j + "] = " + " ");
                data[i][j] = input.nextInt();
            }
        }

        System.out.println("In mang lan thu nhat");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(data[i][j] + "  ");
            }
            System.out.println();
        }


        int[][] temp = new int[columns][rows];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                temp[i][j] = data[j][i];
            }
        }
        data = temp;

        System.out.println("In mang lan thu hai ");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(data[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
