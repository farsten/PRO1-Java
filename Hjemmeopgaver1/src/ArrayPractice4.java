public class ArrayPractice4 {
    void main() {
       int[] numbers = {1, 4, 6, 3, 9, 2};

       int even = 0;
       for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] % 2 != 1) {
               even++;
           }
       }
        IO.println("There are " + even + " numbers!");

    }
}
