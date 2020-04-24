package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the word to reverse: ");
        Scanner keyboard = new Scanner(System.in);

        String word = keyboard.nextLine();
        int arraySize = word.length();
        char[] letters = new char[arraySize];
        int count = 0;

        for (int i = 0; i < arraySize; i++) {
            letters[i] = word.charAt(i);
                if(letters[i] == 'a' | letters[i] == 'e' |letters[i] == 'i' |letters[i] == 'o' | letters[i] == 'u'){
                count++;
            }
        }
System.out.println(count);
    }
}
