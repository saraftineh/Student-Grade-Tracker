package com.mycompany.studentgeadetracker;

import java.util.Scanner;

public class StudentGeadeTracker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GradeTracker gradeTracker = new GradeTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Grade Tracker");
            System.out.println("1. Add a student's grade");
            System.out.println("2. Calculate average grade");
            System.out.println("3. Find highest grade");
            System.out.println("4. Find lowest grade");
            System.out.println("5. View all students and grades");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();
                    gradeTracker.addStudent(name, grade);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    double average = gradeTracker.calculateAverage();
                    if (average == 0) {
                        System.out.println("No grades available.");
                    } else {
                        System.out.println("Average grade: " + average);
                    }
                    break;

                case 3:
                    Student highest = gradeTracker.findHighestGrade();
                    if (highest == null) {
                        System.out.println("No grades available.");
                    } else {
                        System.out.println("Highest grade: " + highest.getGrade() + " (Student: " + highest.getName() + ")");
                    }
                    break;

                case 4:
                    Student lowest = gradeTracker.findLowestGrade();
                    if (lowest == null) {
                        System.out.println("No grades available.");
                    } else {
                        System.out.println("Lowest grade: " + lowest.getGrade() + " (Student: " + lowest.getName() + ")");
                    }
                    break;

                case 5:
                    if (gradeTracker.getStudents().isEmpty()) {
                        System.out.println("No students added yet.");
                    } else {
                        System.out.println("All students and their grades:");
                        for (Student student : gradeTracker.getStudents()) {
                            System.out.println(student.getName() + ": " + student.getGrade());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
