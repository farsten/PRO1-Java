void main() {
    int max = 0;
    int[] arr = {3, 8, 2, 10, 5};
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }

    }
    IO.println("The biggest number is: " + max);
}
