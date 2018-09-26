package OOP;

/*
* Đối tượng Fan 1: Gán giá trị lớn nhất cho speed, radius là 10,
color là yellow và quạt ở trạng thái bật.
*/

public class Fan1 {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println("Quat thu nhat: ");
        fan.setSpeed(3);
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(true);

        System.out.println("toc do: " + fan.getSpeed());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Mau quat: " + fan.getColor());
        System.out.println("Trang thai: " + fan.isOn());
    }
}
