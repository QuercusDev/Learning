package com.company;

import java.util.Scanner;


public class Main {



    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First name: ");
        String firstName=keyboard.next();

        System.out.print("Age: ");
        int age=keyboard.nextInt();

        System.out.print("Amount of money in your pocket: £");
        double money=keyboard.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.format("You've lived %d years and in another %d years you'll be %d years old.\n",age, age, age*2);
        int nameLength = firstName.length();
        System.out.print("Your name is "+nameLength+" letters long.\n");
        System.out.println("Your name is " + firstName + " and you are " + age + ".");
        System.out.format("You have £%.2f on you and you need %.2f.", money, moneyNeeded);
    }
}
