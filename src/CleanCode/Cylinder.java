package CleanCode;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();

        double baseArea = getBaseArea(radius);
        System.out.println("dien tich day: " + baseArea);

        double perimeter = getPerimeter(radius);
        System.out.println("chu vi: " + perimeter);

        double volume = getVolume(radius, height);
        System.out.println("The tich: " + volume);
    }

    public static double getBaseArea(int radius){
        return Math.PI * radius * radius;
    }

    public static double getPerimeter(int radius){
        return 2 * Math.PI  * radius;
    }

    public static double getVolume(int radius, int height){
        double perimeter = getPerimeter(radius);
        double baseArea = getBaseArea(radius);

        return perimeter * height + 2 * baseArea;
    }
}