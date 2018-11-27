package Exception;

import java.util.Scanner;

public class IllegalTriangleException extends Throwable {

    public void TriangleCalculator(int x, int y, int z){
        try{
            if(x > y + z) throw new IllegalTriangleException();

            else if(y > x + z) throw new IllegalTriangleException();

            else if(z > x + y) throw new IllegalTriangleException();

            else {
                System.out.println(x + y + z);
            }

        }catch (IllegalTriangleException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = scanner.nextInt();
        System.out.print("Nhap y: ");
        int y = scanner.nextInt();
        System.out.print("Nhap z: ");
        int z = scanner.nextInt();
        IllegalTriangleException ill = new IllegalTriangleException();
        ill.TriangleCalculator(x, y, z);

    }
}
