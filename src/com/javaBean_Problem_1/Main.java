package com.javaBean_Problem_1;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);



            System.out.println("Enter the name of Student-");
            String name = scanner.nextLine();

            System.out.println("Enter the Roll number of Student-");
            int roll = Integer.valueOf(scanner.nextLine());

            System.out.println("Enter the Marks of Student-");
            int marks = Integer.valueOf(scanner.nextLine());

            Student student = new Student(name, roll, marks);

            System.out.println(student.getStudentName());
        System.out.println(student.getStudentRoll());
        System.out.println(student.getStudentMarks());

    }
}
