package OOP;

/*
1. Trường dữ liệu thuộc kiểu String là symbol lưu mã cổ phiếu symbol.

2. Trường name có kiểu dữ liệu là String lưu tên cô phiếu

3. Trường dữ liệu previousClosingPrice có kiểu dữ liệu double lưu giá cổ phiếu của ngày trước đó

4. Trường dữ liệu currentPrice có kiểu dữ liệu double lưu giá cổ phiếu hiện tại

5. Constructor để tạo đối tượngn cổ phiếu với symbol và name cho trước

6. Phương thức getChangePercent() trả về tỉ lệ phần trăm thay đổi từ previousClosingPrice đến currentPrice.

7. Vẽ sơ đồ UML cho lớp Stock và sau đó cài đặt lớp.

8. Viết chương trình kiểm thử như sau:

Tạo đối tượng Stock với symbol là ORCL và name là Oracle Corporation,
previousClosingPrice là 34.5. Đặt currentPrice là 34.35 và hiển thị tỉ lệ phần trăm thay đổi giá.*/
public class Stock {
    public String symbol = "symbol";
    public String stockName;
    public double previousClosingPrice;
    public double currentPrice;

    Stock(String symbol, String stockName){
        this.symbol = symbol;
        this.stockName = stockName;
    }

    public double getChangePercent(double previousClosingPrice, double currentPrice){
        return  (currentPrice - previousClosingPrice)/currentPrice;
    }


}
