package AbstractAndInterface.CircleComparator;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(2);
        circles[1] = new Circle();
        circles[2] = new Circle(3.2, "yellow",false);

        System.out.println("Pre-sorted");
        for (Circle circle : circles){
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);

        System.out.println("Sorted");
        for(Circle circle : circles){
            System.out.println(circle);
        }
    }
}
