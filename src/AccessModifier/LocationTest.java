package AccessModifier;
/*
* (LocationTest class) Design a class named LocationTest that contains the largest value
* and its position in the two-dimensional array. This class contains the row field,
* columns of type int and maxValue of type public double save the value
* largest in 2 dimensional array. Write the method returns the position
* of the largest value in the two projection array.
* Prototype protocols are as follows:

public static LocationTest locateLargest (double [] [] a)

The locateLargest () method returns an instance of LocationTest.
Write program that allows the user to enter values
for a two dimensional array and display the LocationTest of the element there
the largest value in the array.
*/

import java.util.Scanner;

public class LocationTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row: ");
        int row = sc.nextInt();
        System.out.println("enter column: ");
        int col = sc.nextInt();

        double[][] getArray = getArray(row,col);

        Location l = locateLargest(getArray);
        System.out.println(l.toString());

    }
    //Get rows and columns entered in the main function
    public static double[][] getArray(int row, int col){
        Scanner sc = new Scanner(System.in);
        double[][] a = new double[row][col];

        for(int i = 0; i < row; i++){
            for(int k = 0; k < col; k++){
                System.out.print("enter row number a[" + i + "][" + k + "] = ");
                a[i][k] = sc.nextDouble();
            }
        }
        return a;
    }

    public static Location locateLargest(double[][] a){
        int row = 0;
        int column = 0;
        double maxValue = a[row][column];
        for(int i = 0; i < a.length; i++){
            for(int k = 0; k < a[i].length; k++){
                if(a[i][k] > maxValue){
                    maxValue = a[i][k];
                    row = i;
                    column = k;
                }
            }
        }
        return new Location(row, column, maxValue);
    }
}
