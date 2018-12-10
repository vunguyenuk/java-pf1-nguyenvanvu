package Condition;

import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int year = scanner.nextInt();
    boolean isLeapYear = false;
    if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
      isLeapYear = true;
    }

    if(isLeapYear){
      System.out.printf("%d is a Leap year ", year);
    } else {
      System.out.printf("%d is a NOT Leap year ", year);
    }
  }
}
