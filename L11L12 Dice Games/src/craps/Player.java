package craps;


public class Player {
    private Dice dice1;
    private Dice dice2;
    private int sum;
    private boolean win;
    private int throwOneSum;
    private boolean finished;
    boolean firstThrow = true;

    public Player() {
        this.dice1 = new Dice();
        this.dice2 = new Dice();
    }

    public void throwDice() {
        dice1.roll();
        dice2.roll();
        sum = sumDice();
    }


    public int sumDice() {
        return dice1.getFaceValue() + dice2.getFaceValue();
    }

    public boolean getWin() {
        return win;
    }

    public boolean getFinished() {
        return finished;
    }

    public void play() {
        IO.println("Roll?");
        IO.readln();

        while (!finished) {
            throwDice();
            if (firstThrow) {
                if (sum == 7 || sum == 11) {
                    win = true;
                } else if (sum == 2 || sum == 3 || sum == 12) {
                    win = false;
                    finished = true;
                } else {
                    throwOneSum = sum;
                    firstThrow = false;
                }
            } else if (sum == 7) {
                win = false;
                finished = true;
            } else if (sum == throwOneSum) {
                win = true;
            }
            if (win) {
                finished = true;
            }
            IO.println(String.format("Rolling... sum is %d", sumDice()));
            IO.println();
            if (!finished) {
                IO.println("You have to roll " + throwOneSum + " again to win");
                IO.println();
                IO.readln("Press ENTER to roll again");
                IO.println("=================================");
            }
        }

    }
}
