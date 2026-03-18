package OpgaverL13.ex1;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private String speedName;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = on;
        this.radius = 5;
        this.color = "blue";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        switch (speed) {
            case SLOW -> speedName = "SLOW";
            case MEDIUM -> speedName = "MEDIUM";
            case FAST -> speedName = "FAST";
        }
        if (on) {
            return speedName + " " + color + " " + radius;
        } else return color + " " + radius + " " + "fan is off";
    }
}
