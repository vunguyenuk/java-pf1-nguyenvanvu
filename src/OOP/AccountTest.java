package OOP;

/*
13. Write the test program as follows:

+ Create account with ID 1122, balance is $ 20,000, annual interest rate is 4.5%

+ Use withdrawal to withdraw $ 2,5000 in your account

+ Use the deposit method to deposit $ 3,000 into your account

+ Print account balance, monthly interest and account creation date

*/

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account(1122,20.000);
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2.500);
        acc.deposit(3.000);
        System.out.println("account balance: $" + acc.getBalance());
        System.out.println("interest: " + acc.getMonthlyInterestRate());
        System.out.println("account creation date: "+ acc.getDateCreated());
    }
}
