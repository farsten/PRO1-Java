import java.util.Random;

//Use the Random class) Write a program that creates a Random object with seed
//1000 and displays the first 50 random integers between 0 and 100 using the
//nextInt(100) method.
public class RandomClassApp {
    void main() {
        Random generator = new Random(1000);
        IO.println("From the random number generator: ");
        for (int i = 0; i < 50; i++) {
            IO.println(generator.nextInt(100));
        }
}


}

