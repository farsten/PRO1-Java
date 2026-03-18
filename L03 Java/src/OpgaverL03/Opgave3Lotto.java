package OpgaverL03;

// Generate a random lottery number (in 10..99)
// (as test, not in the finished program: Print the lottery number)
// Prompt the user for a guess of the lottery number
// Read the guess
// if (guess == lottery number)
// print YOU WIN $10.000
// else if guess has the same digits as lottery number (in reversed order)
// print YOU WIN $3.000
// else if guess has one of the digits in lottery number
// print YOU WIN $1.000
// else
// print SORRY, YOU LOOSE
public class Opgave3Lotto {
    void main() {

        int lottoWin = (int) (Math.random() * 90) + 10;

        String guessPrompt = IO.readln("Gæt et tal og se om du vinder: ");
        int guess = Integer.parseInt(guessPrompt);

        int guessTens = guess / 10;
        int guessOnes = guess % 10;
        int lottoTens = lottoWin / 10;
        int lottoOnes = lottoWin % 10;

        if (guess == lottoWin) IO.println("Tillykke! Du vandt 100.000kr!");
        else if (guessTens == lottoOnes && guessOnes == lottoTens) IO.println("Tillykke! Du vandt 10.000kr!");
        else if (guessTens == lottoTens || guessTens == lottoOnes || guessOnes == lottoTens || guessOnes == lottoOnes)
            IO.println("Tillykke! Du vandt 1.000kr!");
        else IO.println("Desværre, du tabte LOL.");

    }
}
