package AccessModifier;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint a = new MyPoint(0,0);
        MyPoint b = new MyPoint(10,30.5);
        System.out.println("space is: " + MyPoint.getDistance(a, b));
    }
}
