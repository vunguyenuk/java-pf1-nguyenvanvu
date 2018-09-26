package AccessModifier;

/*
*
1. Trường id có kiểu số nguyên (private int) để lưu id cho mỗi account (giá trị mặc định là 0)

2. Trường balance có kiểu số thực (private double) để lưu số dư tài khoản (giá trị mặc định là 0)

3. Trường annualInterestRate có kiểu số thực (private double) để lưu tỉ lệ lãi xuất hiện tại (giá trị mặc định là 0) Giả sử tất cả các tài khoản đều có cùng một tỉ lệ lãi xuất

4. Trường dateCreated có kiểu số thực (private Date) để lưu ngày tạo tài khoản

5. Phương thức khởi tạo không tham số tạo một tài khoản mặc định

6. Phương thức khởi tạo với id và balance để tạo một tài khoản với id và số dư cho trước.

7. Cặp phương thức setter và getter để thiết đặt và truy cập vào các thuộc tính id, balance, annualInterestRate, dateCreated.

8. Phương thức getMonthlyInterestRate() trả về tỉ lệ lãi xuất gửi theo tháng,
theo công thức monthlyInterestRate = annualInterestRate / 12.
Chú ý rằng annualInterestRate là một phần trăm, ví dụ 4.5%,
do dó bạn cần phải chia nó cho 100)

9. Phương thức getMonthlyInterest() trả về lãi xuất hàng tháng theo công thức:

10. Phương thức withdraw để rút một khoản tiền từ tài khoản balance * monthlyInterestRate.

11. Phương thức deposit để gửi vào tài khoản một số tiền.

12. Vẽ sơ đồ UML cho lớp Account và cài đặt lớp.

*/


import java.util.Date;

public class Account {
    private int id;
    private static double balance;
    private double annuaInterestRate;
    private Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annuaInterestRate = 0;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuaInterestRate() {
        return annuaInterestRate;
    }

    public void setAnnuaInterestRate(double annuaInterestRate) {
        this.annuaInterestRate = annuaInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate() {
        double monthlyInterestRate = annuaInterestRate / 12;
        return monthlyInterestRate;
    }

    public double getMonthlyInterest() {
        double monthlyInterest = getMonthlyInterestRate() * balance;
        balance += monthlyInterest;
        return monthlyInterest;
    }

    public static double withdraw(double withdrawMoney) {
        balance -= withdrawMoney;
        return withdrawMoney;
    }

    public static double deposit(double depositMoney) {
        balance += depositMoney;
        return depositMoney;
    }
}
