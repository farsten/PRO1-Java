package OpgaverL13.ex2;

public class MyPoint {
    private double x;
    private double y;


    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }



    public double distance(double x, double y, MyPoint myPoint) {
        return Math.pow((Math.pow((myPoint.getX() - x), 2) + Math.pow((myPoint.getY() - y), 2)), 0.5);
    }
    public double distance(double x1, double x2, double y1, double y2) {
        return Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
    }

    public static double distance(MyPoint myPoint1, MyPoint myPoint2) {
        return Math.pow((Math.pow((myPoint2.getX() - myPoint1.getX()), 2) + Math.pow((myPoint2.getY() - myPoint1.getY()), 2)), 0.5);
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}