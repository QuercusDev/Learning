package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String[] guests = new String[10];
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("_______________________");
            System.out.println("-- Menu --");

            System.out.println("1 - Add Guest");
            System.out.println("2 - Remove Guest");
            System.out.println("3 - Exit");

            System.out.println("_______________________");

            System.out.println();

            System.out.println("-- Guests --");
            for (int i = 0; i < guests.length; i++) {
                System.out.println(guests[i] == null ? "--" : guests[i]);
            }
            System.out.println("_______________________");
            System.out.println("Select option: ");
            int option = scanner.nextInt();
            /*if (option == 1) {
                System.out.println("-- Guests --");
                for (int i = 0; i < guests.length; i++) {
                    System.out.println(guests[i] == null ? "--" : guests[i]);
                }
                System.out.println("_______________________");
            }
            else */ if( option == 1) {
                System.out.println("-- Booking --");
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Enter guests name:");
                        String name = scanner.next();
                        guests[i] = name;
                        break;
                    }
                    System.out.println("_______________________");
                }
            }
            else if( option == 2){
                System.out.println("-- Cancellation --");
                    System.out.println("Enter guest name to remove:");
                    String removal = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if(guests[i] != null && guests[i].equals(removal)){
                        guests[i]= null;
                        break;
                    }
                }
                System.out.println("_______________________");
            }
            else if (option == 3) {
                break;
            }
        } while (true);
    }
}
