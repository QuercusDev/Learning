package com.company;
import java.util.Scanner;
public class Main {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        guests[0] = "Ste";
        guests[1] = "Fra";
        guests[2] = "Ale";
        guests[3] = "Mat";
        guests[4] = "Ton";

        do {

            optionsMenu();
            guestList();
            int option = getOption();

            if (option == 1) {
                System.out.println("-- Booking --");
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Enter guests name:");
                        String name = scanner.next();
                        guests[i] = name;
                        break;
                    }
                }
            } else if (option == 2) {
                System.out.println("-- Cancellation --");
                System.out.println("Enter guest name to remove:");
                String removal = scanner.next();
                for (int i = 0; i <= guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(removal)) {
                        guests[i] = null;
                        break;
                    }
                }
                for (int i=0; i<guests.length-1; i++){
                    if(guests[i] == null){
                        guests[i] = guests[i+1];
                        guests[i+1] = null;
                    }
                }
                System.out.println("_______________________");
            }

            else if (option == 3) {
                break;
            }
        } while (true);
    }
    static int getOption() {
        System.out.println("_______________________");
        System.out.println("Select option: ");
        int option = scanner.nextInt();
        return option;
            }

    static void optionsMenu() {
        System.out.println();
        System.out.println("_______________________");
        System.out.println("-- Menu --");

        System.out.println("1 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Exit");

        System.out.println();
        System.out.println("-- Guests --");
        System.out.println("_______________________");

    }
   static void guestList() {
        for (int i = 0, j = 1; i < guests.length; i++, j++) {
            System.out.println(guests[i] == null ? j+ ". --" : j+ ". " + guests[i]);
        }
    }
}
