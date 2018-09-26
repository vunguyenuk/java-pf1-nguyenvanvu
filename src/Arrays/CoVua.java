package Arrays;

import java.util.Scanner;

public class CoVua {
    public static void main(String[] args) {
        int [][] a = new int [8][8];
        char[] str = new char[8];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < str.length; i++){
            System.out.println("Nhap ky tu cho hang " + i + ": ");
            str[i] = sc.next().charAt(0);
        }

        //print the column number
        System.out.print("  "); //print the spacer for the row numbers
        for (int i = 0; i < str.length; i++){
            System.out.print(str[i] + " "); //print the row string
        }

        for (int i = 0; i < a.length;i++){
            System.out.print("\n" + (i + 1) + " "); //new line plus row

            for (int j = 0; j < a[i].length; j++){
                a[i][j] = 0;
                int sum = (i+j);

                if (sum%3==0) {
                    System.out.print("T ");
                } else {
                    System.out.print("F ");
                }
            }
        }
    }
}
