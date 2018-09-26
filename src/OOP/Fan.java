package OOP;
/*
1. 2 hằng được đặt tên là SLOW, MEDIUM, và FAST với giá trị 1, 2, và 3
để biểu thị tốc độ quạt.

2. Trường speed có kiểu số nguyên (private int) để xác định tốc độ quạt,
mặc định là SLOW

3. Trường on có kiểu private boolean để xác định quạt đang bật hay tắt,
mặc định là false (tắt).

4. Trường radius có kiểu private double để xác định bán kính quạt, giá trị mặc định là 5

5. Trường color có kiểu dữ liệu private String để xác định màu quạt, mặc định là blue

6. Các getter và setter cho các thuộc tính

7. Phương thức khởi tạo không tham số tạo đối tượng fan mặc định

8. Phương thức toString() trả về chuỗi chứa thông tin của quạt.
Nếu quạt đang ở trạng thái on, phương thức trả về speed, color,
và radius với chuỗi “fan is on”. Nếu quạt không ở trạng thái on,
phương thức trả về color, radius với chuỗi “fan is off”.

9. Vẽ sơ đồ UML cho lớp và cài đặt lớp

Viết chương trình Hiển thị các đối tượng bằng cách gọi phương thức toString

Tạo 2 đối tượng Fan
Đối tượng Fan 1: Gán giá trị lớn nhất cho speed, radius là 10,
color là yellow và quạt ở trạng thái bật.
Đối tượng Fan 2: Gán giá trị trung bình cho speed, radius là 5,
color là blue và quạt ở trạng thái tắt
*/

public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    Fan(){}

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getToString(){
        if(!isOn()){
            return getSpeed() + getColor() + getRadius() + "fan is on";
        }
        return getColor() + getRadius() + "fan is off";
    }
}
