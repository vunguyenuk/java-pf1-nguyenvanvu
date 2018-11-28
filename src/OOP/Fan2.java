package OOP;
/*
Fan Object 2: Assigns average speed, radius to 5,
The color is blue and the fan is off
*/

public class Fan2 {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println("The second fan: ");
        fan.setSpeed(2);
        fan.setRadius(5);
        fan.setColor("blue");
        fan.setOn(false);

        System.out.println("fan's speed: " + fan.getSpeed());
        System.out.println("fan's radius: " + fan.getRadius());
        System.out.println("fan's color: " + fan.getColor());
        System.out.println("fan's status: " + fan.isOn());


    }
}
