package OpgaverL09.ex4;

public class RectangleApp {
    void main() {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        IO.println("r1: ");
        IO.println("Width: " + r1.getWidth());
        IO.println("Height: " + r1.getHeight());
        IO.println("Area: " + r1.getArea());
        IO.println("Perimeter: " + r1.getPerimeter());

        IO.println();

        IO.println("r2: ");
        IO.println("Width: " + r2.getWidth());
        IO.println("Height: " + r2.getHeight());
        IO.println("Area: " + r2.getArea());
        IO.println("Perimeter: " + r2.getPerimeter());

    }
}
