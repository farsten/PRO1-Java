package rollonedie;

public class Player {
    private Die die;
    private int rollCount;

    public Player() {
        this.die = new Die();
    }

    public int getRollCount() {
        return rollCount;
    }

    public void throwDie() {
        die.roll();
        rollCount++;
    }

    public void play() {
        IO.println("Roll?");
        IO.readln();

        boolean finished = false;
        while (!finished) {
            throwDie();
            IO.println(String.format("Rolling... %d", die.getFaceValue()));

            IO.println("Roll again? (Y/n)");
            String again = IO.readln();
            if (again.equalsIgnoreCase("n")) {
                finished = true;
            }
        }
    }
}
