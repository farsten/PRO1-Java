package model;

import java.util.Random;

public class MultipleChoiceTest {
    private static Random random = new Random();
    private static char[] correctAnswer = {'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B'};


    public static char[] generateAnswers() {
        char[] muligheder = new char[10];

        int[] answers = new int[10];
        for (int i = 0; i < 10; i++) {
            answers[i] = random.nextInt(4);
            switch (answers[i]) {
                case 0 -> muligheder[i] = 'A';
                case 1 -> muligheder[i] = 'B';
                case 2 -> muligheder[i] = 'C';
                case 3 -> muligheder[i] = 'D';
            }
        }
        return muligheder;
    }

    public static char[] getCorrectAnswer() {
        return correctAnswer;
    }

    public static void setCorrectAnswer(char[] correctAnswer) {
        MultipleChoiceTest.correctAnswer = correctAnswer;
    }
}