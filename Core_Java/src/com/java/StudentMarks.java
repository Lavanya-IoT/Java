//write a java program to create an array which can store the marks of 5 students also you must take the marks from the user

package com.java;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        // Create an array to store marks of 5 students
        int [] marks = new int[5];

        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter marks of 5 students:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Displaying the entered marks
        System.out.println("\nMarks of the students are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        sc.close();
    }
}