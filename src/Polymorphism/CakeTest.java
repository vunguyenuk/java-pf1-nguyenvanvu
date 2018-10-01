package Polymorphism;

import java.util.Scanner;

public class CakeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cake[] cake = new Cake[20];
        cake[1] = new Cake("Banh kep", 23.0);
        cake[2] = new Cake("Banh ngot Lapin", 23.0);
        cake[3] = new Cake("Banh pizza", 233.0);
        cake[4] = new Cake("Banh bao", 123.0);
        cake[5] = new Cake("Banh mi", 100.0);
        cake[6] = new Cake("Banh bot loc", 29.0);
        cake[7] = new Cake("Banh carameo", 23.0);
        cake[8] = new Cake("Banh dua", 23.0);
        cake[9] = new Cake("Banh khoai", 27.0);
        cake[10] = new Cake("Banh xoai", 23.0);

        for(int i = 0; i < cake.length; i++){
            System.out.println(" \t " + cake[i]);
        }
    }
}
