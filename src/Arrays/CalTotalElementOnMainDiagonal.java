package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CalTotalElementOnMainDiagonal {
    public static void main(String[] args) {
        int numberOfColumn, numberOfRow, Sum = 0;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter row's number of array: ");
        numberOfColumn = input.nextInt();

        System.out.println("Enter col's number of array: ");
        numberOfRow = input.nextInt();

        int[][] matrix = new int[numberOfColumn][numberOfRow];


        System.out.println("Array just enter: ");
        for (int i = 0; i < numberOfColumn; i++){
            for(int j = 0; j < numberOfRow; j++) {
                System.out.print("enter index of turn [" + i + ", " + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Sum of matrix");
        for (int i = 0; i < numberOfRow; i++ ){
            Sum += matrix[i][i];
        }
        System.out.println("sum is: " + Sum);
    }
}