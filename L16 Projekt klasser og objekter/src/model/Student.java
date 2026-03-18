package model;

import java.util.Arrays;

public class Student {
    private String name;
    private boolean active;
    private int[] grades;
    private char[] answers;

    public Student(String name, boolean active, int[] grades) {
        this.name = name;
        this.active = active;
        this.grades = grades;
        this.answers = new char[10];
    }

    public char[] getAnswers() {
        return answers;
    }

    public void setAnswers(char[] answers) {
        this.answers = answers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        String status = "";
        if (this.active) {
            status = "aktiv";
        } else {
            status = "inaktiv";
        }

        return "Student(" + name + ", " + status + ", " + Arrays.toString(this.grades) + ")";

    }

    public int bestGrade() {
        int best = Integer.MIN_VALUE;
        for (int grade : grades) {
            if (grade > best) {
                best = grade;
            }
        }
        return best;
    }

    public double averageGrade() {
        double average = 0;
        for (double grade : grades) {
            average += grade;
        }
        return average / grades.length;
    }

    public int correctAnswerCount() {
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == MultipleChoiceTest.getCorrectAnswer()[i]) {
                count++;
            }
        }
        return count;
    }
}

