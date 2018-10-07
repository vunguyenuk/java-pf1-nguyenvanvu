package AbstractAndInterface;

public abstract class Shape {
    private String color = "green";
    private boolean filled = true;

    protected Shape() {
    }

    protected Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return  "\ncolor: " + color
                + " and filled: " + filled;
    }
    /**
     * Abstract method getArea
     */
    public abstract double getArea();

    public abstract String getName();

}