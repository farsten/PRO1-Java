package crapsextended;


public class Player {
    private Dice dice1;
    private Dice dice2;
    private int sum;
    private boolean win;
    private boolean loss;
    private int throwOneSum;
    private boolean finished = false;
    boolean firstThrow = true;
    private boolean giveUp = false;
    private int numberWins;
    private int numberLosses;

    public Player() {
        this.dice1 = new Dice();
        this.dice2 = new Dice();
    }

    public void throwDice() {
        dice1.roll();
        dice2.roll();
        sum = sumDice();

        if (firstThrow) {
            if (sum == 7 || sum == 11) {
                win = true;
                finished = true;
            } else if (sum == 2 || sum == 3 || sum == 12) {
                loss = true;
                finished = true;
            } else {
                throwOneSum = sum;
                firstThrow = false;
            }


        } else if (sum == 7) {
            loss = true;
            finished = true;
        } else if (sum == throwOneSum) {
            win = true;
            finished = true;

        }
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

    public boolean getGiveUp() {
        return giveUp;
    }

    public int getNumberWins() {
        return numberWins;
    }

    public int getNumberLosses() {
        return numberLosses;
    }

    public void play() {
        IO.println("Roll?");
        IO.readln();
        while (!giveUp) {
            if (finished) {
                if (win && firstThrow) {
                    IO.println("You won on the first roll!");
                } else if (loss) {
                    IO.println("You lost...");
                } else IO.println("You won!");
                IO.println("============");

            }
            if (finished) {
                String playAgain = IO.readln("Play again? (Y/N)");
                if (playAgain.equalsIgnoreCase("y")) {
                    giveUp = false;
                    finished = false;
                    firstThrow = true;
                    throwOneSum = 0;
                    loss = false;
                    win = false;
                } else giveUp = true;
            }
            while (!finished) {
                throwDice();

                if (win) {
                    finished = true;
                    numberWins++;
                } else if (loss) {
                    finished = true;
                    numberLosses++;

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
    }

