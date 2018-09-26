package AccessModifier;
/*
* (Lớp LocationTest) Thiết kế lớp tên là LocationTest chứa giá trị lớn nhất
* và vị trí của nó trong mảng hai chiều. Lớp này chứa trường row,
* column kiểu public int và maxValue kiểu public double lưu giá trị
* lớn nhất trong mảng 2 chiều. Viết phương thức trả về vị trí
* của phần tử có giá trị lớn nhất trong mảng hai chiếu.
* Nguyên mẫu phương thức như sau:

public static LocationTest locateLargest(double[][] a)

Phương thức locateLargest() trả về một instance của LocationTest.
Viết chương trình cho phép người dùng nhập vào các giá trị
cho một mảng hai chiều và hiển thị LocationTest của phần tử có
giá trị lớn nhất trong mảng.
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
    //lấy hàng và cột được nhập ở hàm main
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
