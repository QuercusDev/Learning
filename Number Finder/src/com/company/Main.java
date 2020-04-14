package com.company;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please select you number for the computer to guess:");
        Scanner keyboard = new Scanner(System.in);

        int guess = 0;
        int start = keyboard.nextInt();

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);



        while(true){
            if(randomNumber < start) {
                randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
                guess++;
            }
            if(randomNumber > start) {
                randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
                guess++;
            }
        }

    }

}
