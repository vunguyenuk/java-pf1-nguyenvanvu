package AbstractAndInterface;

import java.util.Random;
import java.util.Scanner;

public class ResizeableTest {
    public static void main(String[] args) {
        int max = 100;
        int min = 1;
        double random = Math.random()+ 99 + 1;

        Shape[] shapes = {
                new Rectangle(2.5,2),
                new Square(2),
                new Circle(2)
        };

        System.out.println("Truoc khi tang: ");
        for(int i = 0; i < shapes.length; i++){
            System.out.println("phan tu thu " + i + " = " + shapes[i].getArea());
        }

        System.out.println("Sau khi tang: ");
        for(int i = 0; i < shapes.length; i++){

        }
    }
}
