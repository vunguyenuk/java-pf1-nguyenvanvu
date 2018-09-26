package OOP;

/*
* 13. Viết chương trình kiểm thử như sau:

+ Tạo đối tượng Account với ID là 1122, balance là $20,000, annual interest rate là 4.5%

+ Sử dụng phương thức withdraw để rút $2,5000 trong tài khoản

+ Sử dụng phương thức deposit để gửi vào $3,000 vào tài khoản

+ In ra số dư tài khoản, tiền lãi tháng và ngày tạo tài khoản
*/

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account(1122,20.000);
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2.500);
        acc.deposit(3.000);
        System.out.println("So du tai khoan: $" + acc.getBalance());
        System.out.println("Tien lai: " + acc.getMonthlyInterestRate());
        System.out.println("Ngay tao tai khoan: "+ acc.getDateCreated());
    }
}
