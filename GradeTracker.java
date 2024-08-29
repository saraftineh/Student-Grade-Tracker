package com.mycompany.studentgeadetracker;

import java.util.ArrayList;
import java.util.List;

public class GradeTracker {

    private List<Student> students;

    public GradeTracker() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, double grade) {
        students.add(new Student(name, grade));
    }

    public double calculateAverage() {
        if (students.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Student student : students) {
            total += student.getGrade();
        }
        return total / students.size();
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student findHighestGrade() {
        if (students.isEmpty()) {
            return null;
        }
        Student highest = students.get(0);
        for (Student student : students) {
            if (student.getGrade() > highest.getGrade()) {
                highest = student;
            }
        }
        return highest;
    }

    public Student findLowestGrade() {
        if (students.isEmpty()) {
            return null;
        }
        Student lowest = students.get(0);
        for (Student student : students) {
            if (student.getGrade() < lowest.getGrade()) {
                lowest = student;
            }
        }
        return lowest;
    }
}
