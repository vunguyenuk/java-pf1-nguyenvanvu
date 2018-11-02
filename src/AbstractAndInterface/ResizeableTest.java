package AbstractAndInterface;

import AbstractAndInterface.CircleComparator.Circle;

public class ResizeableTest {
    public static void main(String[] args) {
        ResizeableManager resizeableManager = new ResizeableManager(5);
        resizeableManager.Add(new Circle(2.2));
        resizeableManager.Add(new Rectangle(4.2, 5.4));
        resizeableManager.Add(new Square(3.4));
        resizeableManager.show();

        System.out.println("\n");
        System.out.println("----Size not changed-----");
        resizeableManager.getSize(new Circle(1.2));
        resizeableManager.getSize(new Rectangle(2.4,3.2));
        resizeableManager.getSize(new Square(4.5));

        System.out.println("\n");
        System.out.println("----Size Changed!!!----");
        resizeableManager.random(new Circle(1.2));
        resizeableManager.random(new Rectangle(2.4,3.2));
        resizeableManager.random(new Square(4.5));
    }
}