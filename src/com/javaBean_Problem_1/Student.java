package com.javaBean_Problem_1;

public class Student {
    //Private Instance variables
    private int studentRoll;
    private String studentName;
    private int studentMarks;

    //Constructor without params
    public Student () {}

    //Constructor (Overloaded) with params
    public Student (String name, int roll, int marks) {
        this.studentName = name;
        this.studentRoll = roll;
        this.studentMarks = marks;

    }

    //Getters
    public int getStudentRoll() {
        return studentRoll;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    //Setters
    public void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }
}
