package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Enter the word to reverse: ");
	Scanner keyboard = new Scanner(System.in);

	String word = keyboard.next();
	int arraySize = word.length();
	char [] letters = new char [arraySize];

	for (int i = 0; i < arraySize; i++){
		letters[i] = word.charAt(i);
	}
	for (int i = 0, j = arraySize-1; j >= 0; j--, i++){
		char [] reverse = new char[arraySize];
		reverse[i] = letters[j];

			System.out.print(reverse);
	}
    }
}
