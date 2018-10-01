package AbstractAndInterface;


public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(4),
                new Square(2.5),
                new Rectangle(3.2,4),
                new Square(2.4)
        };


        for(int i = 0; i < shapes.length; i++){
            System.out.println("Shape# " + (i+1) + " Area is: "  + shapes[i].getArea());
            if(shapes[i] instanceof Colorable){
                 ((Colorable)shapes[i]).howToColor();
            }
        }
    }
}
