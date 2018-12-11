package Condition;


import java.util.Scanner;

public class CountNumOfDays {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Which month you want to count days ? ");

    int month = scanner.nextInt();
    String daysInMonth = null;

    switch (month){
      case 2:
        daysInMonth = "28 & 29";
        break;
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        daysInMonth = "31";
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        daysInMonth = "30";
        break;
        default:
          System.out.println("Invalid input!");
          break;
    }
    if (daysInMonth != "")
      System.out.printf("The month '%d' has %s days!", month, daysInMonth);
    else
      System.out.print("Invalid input!");
  }
}
