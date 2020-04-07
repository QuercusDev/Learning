package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Please enter the restaurant bill amount:");
            double billAmount = keyboard.nextDouble();

	System.out.print("How many people were dining:");
	        int diners = keyboard.nextInt();

    double splitBill = billAmount/diners;
    System.out.format("Each person should pay €%.2f",splitBill);



    }
}
