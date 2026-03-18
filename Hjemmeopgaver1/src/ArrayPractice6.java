public class ArrayPractice6 {
    void main() {


        double[] arr = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;

        IO.println(avg);

    }
}