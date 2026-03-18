package OpgaverL05While;
//(Palindrome integer) Write the methods with the following headers:
//// Return the reversal of an integer, e.g., reverse(456) returns
//        654
//public static int reverse(int number)

//// Return true if number is a palindrome
//public static boolean isPalindrome(int number)
//Use the reverse method to implement isPalindrome. A number is a palindrome
//if its reversal is the same as itself. Write a test program that prompts the
//user to enter an integer and reports whether the integer is a palindrome
public class Opgave6Palindrome {
    void main() {
        String talPrompt = IO.readln("Giv et tal og find ud af om det er en PALINDROME: ");
        int brugerTal = Integer.parseInt(talPrompt);

        if (isPalindrome(brugerTal)) {
            IO.println("Dit tal er en palindrome!");
        } else {
            IO.println("Dit tal er desværre ikke en palindrome");
        }
        IO.println("Dit tal er: " + reverse(brugerTal));
    }
    public static int reverse(int number) {
        int sidsteCiffer;
        int reverse = 0;
        while (number > 0) {
            sidsteCiffer = number % 10;
            reverse = reverse * 10 + sidsteCiffer;
            number /= 10;
        }
        return reverse;

    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
        }

    }



