package Extend.CircleAndCylinder;

public class Cylinder extends Circle {
    public double height;

    Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        return Math.PI * Math.pow(getRadius(),2) * height;
    }

    @Override
    public String toString(){
        return "Mau sac: "
                + getColor()
                + " Chieu cao: "
                + height
                + " The tich: "
                + getVolume();
    }
}
