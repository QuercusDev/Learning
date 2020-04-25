package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Enter the word to check: ");
        Scanner keyboard = new Scanner(System.in);

        String word = keyboard.next();
        int arraySize = word.length();
        char [] letters = new char [arraySize];
        int count = 0;

        for (int i = 0; i < arraySize; i++){
            letters[i] = word.charAt(i);

            }
        for (int i = 0, j=arraySize-1; i < arraySize/2; i++,j--){
            if(letters[i] == letters[j]){
                count++;
            }
        }
        System.out.println(count >= arraySize/2 ? "Palindrome" : "Not a Pailindrome");
    }
}
