package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please confirm how many students took the exam:");
        int numStudents = keyboard.nextInt();
        System.out.println("Please enter the maximum score on the exam");
        int maxScore = keyboard.nextInt();
        int[] studentScoreData = fillInData(numStudents, maxScore);
        double meanStudentScore = meanScore(numStudents, studentScoreData);
        System.out.format("The mean student score is: %.2f",meanStudentScore);
    }

    public static int[] fillInData(int numStudents, int maxScore) {
        Scanner keyboard = new Scanner(System.in);
        String[] studentNameData = new String[numStudents];
        int[] studentScoreData = new int[numStudents];
        for (int count = 0; count < numStudents; count++) {
                System.out.format("\nPlease enter the student %d's name:",count+1);
                String studentName = keyboard.next();
                studentNameData[count] = studentName;
                System.out.format("\nPlease enter the student %d's score:",count+1);
                int scoreStudent = keyboard.nextInt();
                studentScoreData[count] = scoreStudent;
        }
        return studentScoreData;

    }
    public static double meanScore(int numStudents, int [] studentScoreData){
        double mean = 0.0;
        for(int count = 0; count < numStudents; count++){
            mean = (studentScoreData[count] + mean);
        }
        return mean/numStudents;
    }
    }

