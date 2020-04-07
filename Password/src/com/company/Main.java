package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	String password = "Shark50";
	Scanner keyboard = new Scanner(System.in);

		String attempt;
		do {
			System.out.println("Please enter your password:");
			attempt = keyboard.next();
		}
			while(!attempt.equals(password));
		System.out.println("Password accepted");
		}

    }



