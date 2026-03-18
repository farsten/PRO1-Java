public class ArrayPractice7 {
    void main() {
        int[] arr = {4, 9, 2, 7, 9};

        int largest = Integer.MIN_VALUE;       // smallest possible integer
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;  // old largest becomes second largest
                largest = num;            // update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;      // update second largest if num is smaller than largest but bigger than secondLargest
            }
        }

        IO.println("Second largest: " + secondLargest);

    }
}
