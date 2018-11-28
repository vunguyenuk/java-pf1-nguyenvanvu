package method;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter values : ");
        double n1 = ip.nextDouble();
        double n2 = ip.nextDouble();
        double n3 = ip.nextDouble();

        if(isValid(n1, n2, n3)){
            System.out.println("three edges with valid values");
            System.out.println("print out three sides is: " +  myTriagle(n1, n2 , n3));
        } else {
            System.out.println("three edges with invalid values");
        }
    }

    public static boolean isValid(double s1, double s2, double s3){
        boolean valid = (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1);
            return valid;
    }

    public static double myTriagle(double n1, double n2, double n3){
        double sum = 0, s, areaS;
        sum = (n1 + n2 + n3)/2;
        s = (sum* (sum - n1) * (sum - n2) * (sum - n3));
        areaS = sum/Math.sqrt(s);
        return areaS;

    }
}
