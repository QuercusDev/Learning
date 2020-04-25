package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            System.out.println("Type a sentence which you want a word count for: ");
            Scanner keyboard = new Scanner(System.in);

            String sentence = keyboard.nextLine();

            String [] sentenceArray = sentence.split(" ",-1);
            System.out.println(sentenceArray.length);
    }
}
