package com.company;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please select you number for the computer to guess:");
        Scanner keyboard = new Scanner(System.in);

        int guess = 0;
        int start = keyboard.nextInt();
        int min = 1;
        int max = 100;
        int randomNumber=0;

        do {
            randomNumber = ThreadLocalRandom.current().nextInt(min, max);
            System.out.println(randomNumber);

            if(randomNumber < start) {
                min=randomNumber+1;
                guess++;

            }
                else if(randomNumber > start) {
                max = randomNumber-1;
                guess++;

            }
            }
        while(randomNumber != start);
        System.out.println("The correct answer was:" + start);
        System.out.format("You guessed %d after %d guesses",randomNumber, guess);
        }

    }


