package OpgaverL13.ex5;

public class MyRectangle2DApp {
    void main() {

        MyRectangle2D r1 = new MyRectangle2D();
        MyRectangle2D r2 = new MyRectangle2D(25, 25, 100, 50);
        MyRectangle2D r3 = new MyRectangle2D(24, 24, 50, 25);


       printResults(r1);
       IO.println("Is the point inside the rectangle? " + r1.contains(2, 25));
       printResults(r2);
       IO.println("Is the point inside the rectangle? " + r2.contains(26, 25));
       IO.println("Is the rectangle inside your rectangle? " + r2.contains(r1));


    }
    public void printResults(MyRectangle2D rectangle2D) {
        IO.println("=========");
        IO.println("Area: " + rectangle2D.getArea());
        IO.println("Perimeter: " + rectangle2D.getPerimeter());

    }
}
