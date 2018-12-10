package Condition;

import java.util.Scanner;

public class CoefficientsSalary {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter year of work: ");
    int yearOfwork = scanner.nextInt();
    System.out.print("Enter Coefficients Salary: ");
    int CES = scanner.nextInt();
    int salaryOfMonth;

    if(CES > 1 && CES < 6){
      salaryOfMonth = CES * 4000000 + yearOfwork * 500000;
      System.out.print("salary is: "+ salaryOfMonth + " VND");
    }else{
      System.out.print("condition for payment is not valid");
    }
  }
}
