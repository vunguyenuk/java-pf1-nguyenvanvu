package AccessModifier;

/*
13. Write the test program as follows:

+ Create account with ID 1122, balance is $ 20,000, annual interest rate is 4.5%

+ Use withdrawal to withdraw $ 2,5000 in your account

+ Use the deposit method to deposit $ 3,000 into your account

+ Print account balance, monthly interest and account creation date
*/

import java.util.Scanner;
import static AccessModifier.Account.deposit;
import static AccessModifier.Account.withdraw;

public class AccountTest {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }
        int choice = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id: ");
        int id = scanner.nextInt();

        do {
            System.out.println("Main Menu: ");
            System.out.println("1: Check balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Exit");
            System.out.println("Enter the choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double balance = accounts[id].getBalance();
                    System.out.println("The balance is " + balance);
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    withdraw(withdraw);
                    break;
                case 3:
                    System.out.print("Enter an amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    deposit(deposit);
                    break;
            }
        } while (choice != 4);

    }
}
