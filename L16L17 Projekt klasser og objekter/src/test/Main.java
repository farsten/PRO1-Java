package test;

import model.MultipleChoiceTest;
import model.Student;
import model.Team;

import java.util.Arrays;

public class Main {
    void main() {
        int[] gradeS1 = new int[3];


        Student y1 = new Student("Ib", true, gradeS1);
        Student y2 = new Student("Ulla", true, gradeS1);
        Student y3 = new Student("Per", false, gradeS1);

        Team t1 = new Team("26V", "A1.32");

        t1.addStudent(y1);
        t1.addStudent(y2);
        t1.addStudent(y3);

        Student v1 = new Student("Hans", true, gradeS1);
        Student v2 = new Student("Anna", true, gradeS1);
        Student v3 = new Student("Leo", false, gradeS1);

        Team t2 = new Team("26Y", "A1.28");

        t2.addStudent(v1);
        t2.addStudent(v2);
        t2.addStudent(v3);
        Team[] teams = {t1, t2};

        v1.setGrades(new int[]{00, 12, 4});
        v2.setGrades(new int[]{02, 10, 7});
        v3.setGrades(new int[]{-3, 12, -3});

        y1.setGrades(new int[]{12, 12, 00});
        y2.setGrades(new int[]{12, -3, -3});
        y3.setGrades(new int[]{7, 4, 4});
        udskrivInfo(teams);
        IO.println("Elever med karaktersnit over 5: ");
        IO.println(Arrays.toString(t1.highScoreStudents(5)));
        IO.println(Arrays.toString(t2.highScoreStudents(5)));

        for (Team t : teams) { // får hvert studerendes svar:
            for (Student student : t.getStudents()) {
                student.setAnswers(MultipleChoiceTest.generateAnswers());
                IO.println(student.getName() + ": " + Arrays.toString(student.getAnswers()));
            }
        }

        for (Team t : teams) { //får hvert studerendes antal rigtige svar:
            IO.println("Number of correct answers in " + t.getName());
            int i = 0;
            int[] counts = t.correctStudentAnswerCounts();
            for (Student names : t.getStudents()) {
                IO.println(names.getName() + ": " + counts[i]);
                i++;
            }
        }
        for (Team t : teams) { // får hvert studerenes info
            IO.println("Team " + t.getName());
                String[] info = t.studentInfos();
                IO.println(Arrays.toString(info));
            }
        for (Team t : teams) { // får hvert hold's samlet korrekt pr spørgsmål
            IO.println("Times that questions where correct of team " + t.getName());
            IO.println(Arrays.toString(t.correctQuestionAnswerCounts()));
        }
    }


    public void udskrivInfo(Team[] teams) {

        IO.println("Teams: ");
        for (Team t : teams) {  // udskriver hvert holds navn + rum
            IO.println(t.toString());
        }
        IO.println();

        for (Team t : teams) { //udskriver studernes navn, hold, aktivitetniveau og karakterer pr hold
            IO.println("Students in team " + t.getName() + ":");
            IO.println(t.getStudents().toString());
            IO.println();
        }

        for (Team t : teams) { // udskriver alle de aktive studerende pr hold
            IO.println("Active students in " + t.getName() + ":");
            for (String studentName : t.activeStudents()) {
                IO.print(studentName + " ");
            }
            IO.println();
        }
    }

}
