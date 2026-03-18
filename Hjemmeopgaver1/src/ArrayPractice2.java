public class ArrayPractice2 {
    void main() {
        int[] numbers = {12, 23, 15, 85, 10, 19};
        int sum = 0;
        for (int num: numbers) {
            sum += num;

        }
        IO.println("Summen af talene fra array er: " + sum);
    }
}
