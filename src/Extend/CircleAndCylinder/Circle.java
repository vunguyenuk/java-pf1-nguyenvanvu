package Extend.CircleAndCylinder;

public class Circle {
    public double radius;
    public String color;

    Circle( double radius, String color){
        this.radius = radius;
        this.color = color;
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

    @Override
    public String toString(){
        return "Mau sac: "
                + getColor()
                + " radius: "
                + getRadius();
    }
}
