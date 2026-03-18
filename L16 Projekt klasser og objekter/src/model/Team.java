package model;

import java.util.ArrayList;

public class Team {
    private String name;
    private String room;
    private ArrayList<Student> students;


    public Team(String name, String room) {
        this.name = name;
        this.room = room;
        this.students = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "Team(" + this.name + ", " + this.room + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void removeStudent(String name) {
        boolean hasFound = false;
        int i = 0;
        while (!hasFound && i < students.size()) {
            if (students.get(i).getName().equals(name)) {
                students.remove(i);
                hasFound = true;
            }
            i++;
        }
    }

    public String[] activeStudents() {
        int count = 0;
        for (Student student : students) {
            if (student.isActive()) {
                count++;
            }
        }
        String[] activeStudentNames = new String[count];
        int index = 0;
        for (Student student : students)
            if (student.isActive()) {
                activeStudentNames[index] = student.getName();
                index++;

            }
        return activeStudentNames;


    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public double averageGradeTeam() {
        double totalSum = 0;
        double totalGradeCount = 0;

        for (Student student : students) {
            int[] grades = student.getGrades();
            for (int grade : grades) {
                totalSum += grade;
            }
            totalGradeCount += grades.length;
        }
        return totalSum / totalGradeCount;
    }

    public Student[] highScoreStudents(double minAverage) {
        int count = 0;
        for (Student student : students) {
            if (student.isActive() && student.averageGrade() > minAverage) {
                count++;

            }
        }
        Student[] overGennemsnitAktiv = new Student[count];
        int index = 0;
        for (Student student : students) {
            if (student.isActive() && student.averageGrade() > minAverage) {
                overGennemsnitAktiv[index] = student;
                index++;
            }
        }
        return overGennemsnitAktiv;
    }

    public int[] correctStudentAnswerCounts() {
        int[] correctStudentAnswers = new int[students.size()];
        int index = 0;
        for (Student student : students) {
            correctStudentAnswers[index] = student.correctAnswerCount();
            index++;
        }

        return correctStudentAnswers;

    }

        public String[] studentInfos() {
            String[] info = new String[students.size()];
            int index = 0;

            for (Student student : students) {
                info[index] = String.format("  %-5s | Avg. grade: %.2f | Correct: %d",
                        student.getName(),
                        student.averageGrade(),
                        student.correctAnswerCount()
                );
                index++;
            }
            return info;
    }

    public int[] correctQuestionAnswerCounts() {
        int[] correctAnswerList = new int[10];

        for (int i = 0; i < correctAnswerList.length; i++) {
            int count = 0;
            for (Student student : students) {
                if (student.getAnswers()[i] == MultipleChoiceTest.getCorrectAnswer()[i]) {
                    count++;
                }
            }
            correctAnswerList[i] = count;
        }
        return correctAnswerList;
    }
}
