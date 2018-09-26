package OOP;

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
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;



    Account(){
        dateCreated = new Date();
    }

    Account(int id, double balance){
        this();
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

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate(){
        return ((annualInterestRate / 100) / 12);
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public double withdraw(double amount){
        return balance = balance - amount;
    }

    public double deposit(double amount){
        return balance = balance + amount;
    }


}
