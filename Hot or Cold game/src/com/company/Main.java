package com.company;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Main {

    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println("Please enter your guess:");
        Scanner keyboard = new Scanner(System.in);
        int guess = keyboard.nextInt();
        int guessNumber = 1;
        do{
            if(guess<randomNumber)

            {
                System.out.println("You're guess is too low!\n Guess again:");
                guess = keyboard.nextInt();
                guessNumber++;
            }
            else if (guess>randomNumber)
            {
                System.out.println("You're guess is too high!\n Guess again:");
            guess = keyboard.nextInt();

            }
                   }
        while (guess!=randomNumber);
        System.out.format("Well done you guessed correctly with %d guesses",guessNumber);
    }
}
