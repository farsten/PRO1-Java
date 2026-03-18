package OpgaverL13.ex1;

public class FanApp {
    void main() {
        Fan f1 = new Fan();
        f1.setSpeed(Fan.FAST);
        f1.setOn(true);
        f1.setRadius(10);
        f1.setColor("yellow");

        Fan f2 = new Fan();
        f2.setSpeed(Fan.MEDIUM);
        f2.setOn(false);
        f2.setRadius(5);
        f2.setColor("blue");

        Fan baseline = new Fan();

        IO.println("Fan 1 = " + f1);
        IO.println("Fan 2 = " + f2);
        IO.println("Fan 3 = " + baseline);
    }

}
