package test;

import model.MultipleChoiceTest;
import model.Student;
import model.Team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    private final ArrayList<Team> allTeams = new ArrayList<>();

    void main() {

        boolean finished = false;

        while (!finished) {
            printMenu();
            int input = Integer.parseInt(IO.readln());
            IO.println();
            switch (input) {
                case 1 -> {
                    Scanner scanner = new Scanner(IO.readln("Enter the team name and room: "));

                    String str = scanner.nextLine();
                    String[] strArray = str.split(" ");
                    if (strArray.length == 2) {
                        String teamName = strArray[0];
                        String roomName = strArray[1];
                        Team newTeam = new Team(teamName, roomName);
                        allTeams.add(newTeam);

                        IO.println("--> Team created with name and room set to " + teamName + " and " + roomName);
                        IO.println();
                    } else {
                        IO.println("ERROR: INVALID INPUT");
                        IO.println();
                    }
                }

                case 2 -> {
                    boolean found = false;
                    while (!found) {
                        String teamName = IO.readln("Name of team (or type 'back' to cancel): ");
                        if (teamName.equalsIgnoreCase("back")) {
                            IO.println("Returning to main menu...");
                            IO.println();
                            break;
                        } else {

                            for (Team team : allTeams) {
                                if (teamName.equals(team.getName())) {
                                    found = true;
                                    Scanner scanner = new Scanner(IO.readln("Student's name and activity status (true/false): "));

                                    String str = scanner.nextLine();
                                    String[] strArray = str.split(" ");
                                    if (strArray.length == 2 && (strArray[1].equalsIgnoreCase("true") || strArray[1].equalsIgnoreCase("false"))) {
                                        String studentName = strArray[0];
                                        boolean isActive = Boolean.parseBoolean(strArray[1]);

                                        scanner = new Scanner(IO.readln("Student's number of grades: "));
                                        int gradeCount = scanner.nextInt();
                                        scanner = new Scanner(IO.readln(("Student's " + gradeCount + " grades: ")));
                                        int[] studentGrades = new int[gradeCount];
                                        for (int i = 0; i < gradeCount; i++) {
                                            studentGrades[i] = scanner.nextInt();
                                        }

                                        Student newStudent = new Student(studentName, isActive, studentGrades);
                                        newStudent.setAnswers((MultipleChoiceTest.generateAnswers()));
                                        team.addStudent(newStudent);

                                        String active;
                                        if (isActive) {
                                            active = "(active)";
                                        } else active = "(inactive)";
                                        IO.println("--> Student " + studentName + active + " with grades " + Arrays.toString(studentGrades) + " created in team " + teamName);
                                        IO.println();
                                    } else {
                                        IO.println("ERROR: INVALID INPUT");
                                        IO.println();
                                    }

                                }
                            } if (!found) {
                                IO.println("ERROR: TEAM NOT FOUND");
                                IO.println();
                            }
                        }
                    }
                }
                case 3 -> {
                    boolean found = false;
                    while (!found) {
                        String studentName = IO.readln("Name of student (or type 'back' to cancel): ");
                        if (studentName.equalsIgnoreCase("back")) {
                            IO.println("Returning to main menu...");
                            IO.println();
                            break;
                        } else for (Team team : allTeams) {
                            for (Student student : team.getStudents()) {
                                if (student.getName().equalsIgnoreCase(studentName)) {
                                    String[] info = team.studentInfos();
                                    IO.println(Arrays.toString(info));
                                    IO.println();
                                    found = true;
                                }
                            }
                        }
                        if (!found) {
                            IO.println("STUDENT NOT FOUND. TRY AGAIN!");
                            IO.println();
                        }
                    }

                }
                case 4 -> {
                    boolean found = false;
                    while (!found) {
                        String teamName = IO.readln("Name of team (or type 'back' to cancel): ");
                        if (teamName.equalsIgnoreCase("back")) {
                            IO.println("Returning to main menu...");
                            IO.println();
                            break;
                        } else for (Team team : allTeams) {
                            if (team.getName().equalsIgnoreCase((teamName)) && !team.getStudents().isEmpty()) {
                                String[] info = team.studentInfos();
                                IO.println(Arrays.toString(info));
                            } else {
                                IO.println("ERROR: NO STUDENTS IN TEAM ");
                                IO.println();
                            }
                            found = true;
                        }
                        if (!found) {
                            IO.println("ERROR: TEAM NOT FOUND. TRY AGAIN");
                            IO.println();
                        }
                    }

                }
                case 5 -> {
                    if (allTeams.isEmpty()) {
                        IO.println("ERROR: NO TEAMS HAS BEEN FOUND!");
                        IO.println();
                    }
                    for (Team team : allTeams) {
                        if (team.getStudents().isEmpty()) {
                            IO.println("ERROR: NO STUDENTS IN TEAM " + team.getName());
                            IO.println();
                        } else IO.println(team.getName());
                        String[] info = team.studentInfos();
                        IO.println(Arrays.toString(info));
                    }
                }
                case 6 -> {
                    boolean found = false;
                    String teamName = IO.readln("Name of team (or type 'back' to cancel): ");

                    if (teamName.equalsIgnoreCase("back")) {
                        IO.println("Returning to main menu...");
                        IO.println();
                    } else {
                        for (int i = allTeams.size() - 1; i >= 0; i--) {
                            if (allTeams.get(i).getName().equalsIgnoreCase(teamName)) {
                                IO.println("Team " + allTeams.get(i).getName() + " and its students have been removed.");
                                allTeams.remove(i);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            IO.println("ERROR: NO TEAMS FOUND!");
                            IO.println();
                        }
                    }
                }
                case 7 -> {
                    boolean found = false;
                    String studentName = IO.readln("Name of student (or type 'back' to cancel): ");

                    if (studentName.equalsIgnoreCase("back")) {
                        IO.println("Returning to main menu...");
                    } else {

                        for (Team team : allTeams) {
                            ArrayList<Student> students = team.getStudents();

                            for (int i = students.size() - 1; i >= 0; i--) {
                                if (students.get(i).getName().equalsIgnoreCase(studentName)) {
                                    IO.println("Student " + students.get(i).getName() + " removed from " + team.getName());
                                    students.remove(i);
                                    found = true;
                                    break;
                                }
                            }
                            if (found) break;
                        }

                        if (!found) {
                            IO.println("ERROR: INVALID STUDENT NAME!");
                        }
                    }
                }
                case 8 -> {
                    IO.println("Program finished.");
                    finished = true;
                }
                default -> {
                    IO.println("ERROR: INVALID INPUT. TRY AGAIN!");
                    IO.println();
                }
            }
        }
    }

    public void printMenu() {
        IO.println("MENU");
        IO.println("1: Create a team");
        IO.println("2: Create a player");
        IO.println("3: Show one student's info and results");
        IO.println("4: Show one teams's info and results");
        IO.println("5: Show info and results for all teams");
        IO.println("6: Remove team");
        IO.println("7: Remove player");
        IO.println("8: Exit program");
    }
}