package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

	System.out.println("Please enter your age:");
	int age = keyboard.nextInt();

	if (age>17.99) {
		System.out.println("Welcome to the website.");
	}
	else if (age<10){
			System.out.println("You are so very very young.");
    }
	else {
	    System.out.println("Sorry, you are too young to access this website.");
    }



    }
}
