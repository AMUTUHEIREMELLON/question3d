/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.gradingsystem;

import java.util.Scanner;

/**
 *
 * @author Amutuheire
 */
public class GradingSystem {
    
            public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;  // To count number of students processed
        int[] gradeCount = new int[10]; // Array to count how many students got each grade (index 1–9)

        while (count < 5) {
            System.out.print("Enter score for student " + (count + 1) + " (0 - 100): ");
            int score = input.nextInt();

            int grade = 0;
            String remark = "";

            // Determine grade and remark
            if (score >= 80 && score <= 100) {
                grade = 1;
                remark = "Distinction";
            } else if (score >= 75 && score <= 79) {
                grade = 2;
                remark = "Distinction";
            } else if (score >= 66 && score <= 74) {
                grade = 3;
                remark = "Credit";
            } else if (score >= 60 && score <= 65) {
                grade = 4;
                remark = "Credit";
            } else if (score >= 50 && score <= 59) {
                grade = 5;
                remark = "Credit";
            } else if (score >= 45 && score <= 49) {
                grade = 6;
                remark = "Credit";
            } else if (score >= 35 && score <= 44) {
                grade = 7;
                remark = "Pass";
            } else if (score >= 30 && score <= 34) {
                grade = 8;
                remark = "Pass";
            } else if (score >= 0 && score <= 29) {
                grade = 9;
                remark = "Fail";
            } else {
                System.out.println("Invalid score! Please enter a value between 0 and 100.");
                continue; // Skip invalid score and prompt again
            }

            // Display individual student result
            System.out.println("\n--- Student " + (count + 1) + " Result ---");
            System.out.println("Score: " + score);
            System.out.println("Grade: " + grade);
            System.out.println("Remark: " + remark);
            System.out.println();

            // Count the grade occurrence
            gradeCount[grade]++;

            // Increment student count
            count++;
        }

        // Display summary
        System.out.println("\n====== GRADE SUMMARY ======");
        for (int i = 1; i <= 9; i++) {
            System.out.println("Grade " + i + ": " + gradeCount[i] + " student(s)");
        }
    }

}