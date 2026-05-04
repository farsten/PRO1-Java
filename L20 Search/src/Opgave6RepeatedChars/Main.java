package Opgave6RepeatedChars;
//Write a search method, named repeatedChars(), with two parameters: a string s, and a positive
//int k.
//The method must return a boolean indicating whether the same character is found in k
//adjacent positions in the string. OBS: This is an advanced search!
//Examples:
//repeatedChars("vnhstxxxabyy", 3) and repeatedChars("vnhstxxabyyy", 3) both returns true,
//because a character is found in 3 adjacent places in the string.
//repeatedChars("vnhstxxabyyy",4) returns false.
public class Main {
    void main() {

        String s = "vnhstxxxabyy";

        String s1 = "vnhstxxabyyy";


    }

    public int find(String sm, String m) {
        int indeks = -1;
        int i = 0;
        while (indeks == -1 && i <= sm.length() - m.length()) {
            boolean matchFound = match(sm, m, i);
            if (matchFound) {
                indeks = i;
            } else
                i++;
        }
        return indeks;
    }

    private boolean match(String sm, String m, int i) {
        boolean foundDiff = false;
        int j = 0;
        while (!foundDiff && j < m.length()) {
            char k = sm.charAt(i + j);
            if (k != m.charAt(j)) {
                foundDiff = true;
            } else
                j++;
        }
        return !foundDiff;
    }

}

