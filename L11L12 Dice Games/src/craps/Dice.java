package craps;

public class Dice {
    private int faceValue;

    public Dice() {
        faceValue = 0;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void roll() {
        faceValue = (int) (Math.random() * 6) + 1;
    }
}
