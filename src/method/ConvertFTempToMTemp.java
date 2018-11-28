package method;

import java.util.Scanner;

public class ConvertFTempToMTemp {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter meter: ");
        double mt = ip.nextDouble();

        System.out.print("Enter foot: ");
        double ft = ip.nextDouble();

        convertMeterToFeet(mt);
        convertFeetToMeter(ft);
    }

    public static void convertMeterToFeet(double meter) {
        double feet;
        feet = 3.279 * meter;
        System.out.println("Meter convert to foot is: " + feet);
    }

    public static void convertFeetToMeter(double feet) {
        double meter;
        meter = 0.305 * feet;
        System.out.println("Foot convert to meter is: " + meter);
    }
}
