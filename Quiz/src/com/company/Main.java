package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

    int score = 0;

	String questions[] = new String[]{
	        "The capital of France is Dublin",
            "7 times 7 equals 49.",
            "Italy is shaped like a boot.",
            "The sky is blue.",
            "the grass is green."};

    boolean answers [] = new boolean[]{
                false, true, true, true, true};

    boolean responses [] = new boolean [5];

    System.out.println("Your quiz has begin, pleae answer with true or false to all five questions below:");

    for(int i = 0; i<questions.length; i++)
        {
        System.out.println(questions[i]);
        responses[i] = keyboard.nextBoolean();
            if (responses[i] == answers[i])
            {
                score++;
            }

        }

    System.out.format("Your final score was %d out of %d.",score, questions.length);

    }
    }