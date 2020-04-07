package com.company;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        System.out.println("Please pick a number between 1 and 5 inclusive.");
        int guess = keyboard.nextInt();

        if (randomNumber == guess) {
            System.out.println("Congratultions, the random number was " + randomNumber + " and you guessed correctly");
        } else if (randomNumber != guess) {
            System.out.println("Oh hard luck, the random number was " + randomNumber + " but you guessed " + guess + " which is incorrect");
            System.out.println("Would you like to guess again?");
            int guess2 = keyboard.nextInt();
            int randomNumber2 = ThreadLocalRandom.current().nextInt(1, 6);
            if (randomNumber2 == guess2) {
                System.out.println("Congratultions, the random number was " + randomNumber2 + " and you guessed correctly");
            } else if (randomNumber2 != guess2) {
                System.out.println("Oh hard luck, the random number was " + randomNumber2 + " but you guessed " + guess2 + " which is incorrect");

            }
        }
    }
}

