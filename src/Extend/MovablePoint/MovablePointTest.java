package Extend.MovablePoint;

public class MovablePointTest {
    public static void main(String[] args) {
        Point point = new MovablePoint();
        ((MovablePoint) point).setXSpeed(2);
        ((MovablePoint) point).setYSpeed(3);
        ((Point) point).setX(4);
        ((Point) point).setY(5);
        System.out.println(point);
    }
}
