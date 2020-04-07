package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

	System.out.println("What is your name?");
	String nameInput=keyboard.next();
	String nameSentence = nameInput + " is a nice name.";
	System.out.println(nameSentence);

	System.out.println("How old are you?");
	int ageInput=keyboard.nextInt();
	String ageSentence = ageInput +" is a good age.";
	System.out.println(ageSentence);

	System.out.println("Would you like to purchase anything?");
	String purchaseInput=keyboard.next();
	String purchaseSentence = purchaseInput +"'s are every expensive and you have enough!";
	System.out.println(purchaseSentence);

    }
}
