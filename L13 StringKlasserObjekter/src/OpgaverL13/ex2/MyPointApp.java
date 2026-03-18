package OpgaverL13.ex2;

public class MyPointApp {
    void main() {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);

        IO.println(p1.distance(1, 2, 3 ,5));
        IO.println(p1.distance(32, 41, p2));
        IO.println(p1.distance(p2, p1));





    }
}
