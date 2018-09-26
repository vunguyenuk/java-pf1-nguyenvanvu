package OOP;
/*
Đối tượng Fan 2: Gán giá trị trung bình cho speed, radius là 5,
color là blue và quạt ở trạng thái tắt
*/

public class Fan2 {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println("Quat thu hai: ");
        fan.setSpeed(2);
        fan.setRadius(5);
        fan.setColor("blue");
        fan.setOn(false);

        System.out.println("Toc do quat thu hai: " + fan.getSpeed());
        System.out.println("Radius quat thu hai: " + fan.getRadius());
        System.out.println("Mau quat thu hai: " + fan.getColor());
        System.out.println("Trang thai quat thu hai: " + fan.isOn());


    }
}
