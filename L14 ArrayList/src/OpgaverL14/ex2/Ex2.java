package OpgaverL14.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    void main() {
        Scanner scanner = new Scanner(IO.readln("Angiv antal du vil give: "));
        ArrayList<Integer> list = new ArrayList<>();
        int antal = scanner.nextInt();

        for (int i = 1; i < antal + 1; i++) {
            int numbers = Integer.parseInt(IO.readln("Angiv " + i + ". tal: "));
            list.add(numbers);
        }
        IO.println();
        IO.println("The sum: " + sum(list));
        IO.println("The smallest number: " + minimum(list));
        IO.println("The biggest number: " + maximum(list));
        IO.println("The average:  " + average(list));
        IO.println("Amount of zeroes: " + zeroes(list));
        IO.println("Even numbers: " + evens(list));

    }

    public int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public int minimum(ArrayList<Integer> list) {
        int minimum = list.getFirst();
        for (int num : list) {
            if (num < minimum) {
                minimum = num;
            }
        }
        return minimum;
    }

    public int maximum(ArrayList<Integer> list) {
        int maximum = list.getFirst();
        for (int num : list) {
            if (num > maximum) {
                maximum = num;
            }
        }
        return maximum;
    }

    public double average(ArrayList<Integer> list) {
        int avg = 0;
        for (int num : list) {
            avg += num;
        }
        return (double) avg / list.size();
    }

    public int zeroes(ArrayList<Integer> list) {
        int count = 0;
        for (int num : list) {
            if (num == 0) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Integer> evens(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) {
                newList.add(num);
            }
        }
        return newList;
    }
}
