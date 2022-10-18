package com.company.Composite.Student;

public class Main {

    public static void main(String...args) {
        Student_A student_a = new Student_A();
        Student_B student_b = new Student_B();
        Grading grading = new Grading();
        grading.addStudent(student_a,student_b);
        grading.getGrade(100);
    }
}
