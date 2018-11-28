package Arrays;


import java.util.Scanner;

public class StudentManagerment {
    public static void main(String[] args) {
        int[] scoreStudent = new int[3];

        for(int i = 0; i < scoreStudent.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter student score of turn " + i + ": ");
            scoreStudent[i] = sc.nextInt();

        }
        for(int i = 0; i < scoreStudent.length; i++ ){
            System.out.println("Enter student score of turn " + i + " is: " + scoreStudent[i]);
        }


    }
}
