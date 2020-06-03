package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the DBH: ");
        double dbh = input.nextDouble();
        System.out.println("Please enter the tree height: ");
        double length = input.nextDouble();


        Tree test = new Tree(dbh,length);
	test.treeBuild();

    }
}
