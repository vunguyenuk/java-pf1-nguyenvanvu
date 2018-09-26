package AccessModifier;

public class MyPoint {
    public double x;
    public double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double getDistance(MyPoint a, MyPoint b){
        double x1 = a.x;
        double y1 = a.y;
        double x2 = b.x;
        double y2 = b.y;
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}
