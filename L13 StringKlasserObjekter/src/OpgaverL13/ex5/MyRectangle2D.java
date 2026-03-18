package OpgaverL13.ex5;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (height + width) * 2;
    }

    public boolean contains(double x, double y) {
        return (x >= this.x && x <= this.x + width && y >= this.y && y <= this.y + height);
    }

    public boolean contains(MyRectangle2D rec) {
        return this.contains(rec.x, rec.y) && this.contains(rec.x + rec.width, rec.y + rec.height);
    }
}

