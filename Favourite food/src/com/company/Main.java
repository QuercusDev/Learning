package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	String[] list = new String[3];
    Scanner keyboard = new Scanner(System.in);
	System.out.println("Please enter your five favourite foods:");
        list[0] = keyboard.nextLine();
        list[1] = keyboard.nextLine();
        list[2] = keyboard.nextLine();

        System.out.format("No more memory left for more foods. Your favourite foods are: %s, %s and %s.",list[0],list[1],list[2]);
    }
}
