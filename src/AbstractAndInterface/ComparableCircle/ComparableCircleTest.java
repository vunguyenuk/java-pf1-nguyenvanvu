package AbstractAndInterface.ComparableCircle;

import AbstractAndInterface.CircleComparator.Circle;
import AbstractAndInterface.CircleComparator.CircleComparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableCircleTest{
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(2.5);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5,"yellow",false);

        System.out.println("Pre-sorted:");
        for(Circle circle: circles){
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
//        Arrays.sort(circles, circleComparator);

        sort(circles,circleComparator);
        System.out.println("After-sorted:");
        for(Circle circle : circles){
            System.out.println(circle);
        }
    }

    public static void sort(Object[] objects, Comparator comparator){
        Object bienTam;
        for(int i = 0; i < objects.length - 1; i++){
            for(int j = objects.length - 1; j > i; j--){
                if(comparator.compare(objects[i],objects[j]) == 1){
                    bienTam = objects[i];
                    objects[i] = objects[j];
                    objects[j] = bienTam;
                }
            }
        }
    }

}
