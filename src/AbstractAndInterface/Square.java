package AbstractAndInterface;

public class Square extends Shape implements Colorable,Resizeable {
    public double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(){
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public void resize(double percent) {
        System.out.println(getSide() * percent /100.0);
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public String toString() {
        return " Square " + super.toString() + " \t " + getArea();
    }
}

