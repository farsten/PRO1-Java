void main() {
    IO.println("Enter count of numbers:");
    int numberPrompt = Integer.parseInt(IO.readln());

    IO.println("Enter some numbers 1..99 on one line: ");
    String input = IO.readln();
    Scanner scanner = new Scanner(input);

    int i = 0;
    int count = 0;
    int max = 0;
    do {
        i++;
        int number = scanner.nextInt();
        if (max == number) {
            count += 1;
        }

        if (number > max) {
            max = number;
            count = 1;
        }

    } while (numberPrompt > i);
    IO.println("Det største tal er " + max + " og det kom " + count + " gang(e)");
}