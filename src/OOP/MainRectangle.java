package OOP;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.4,2.4);

        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
