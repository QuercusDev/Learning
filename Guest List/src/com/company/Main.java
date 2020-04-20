package com.company;
import java.util.Scanner;
public class Main {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        insertTestNames();
        do {
            optionsMenu();
            guestList();
            int option = getOption();

            if (option == 1) {
                addGuest();
            } else if (option == 2) {
                removeGuest();
            } else if (option == 3) {
                rename();
            } else if (option == 4) {
                reserve();

            } else if (option == 5) {
                break;
            }
        } while (true);
    }

    static int getOption() {
        System.out.println("_______________________");
        System.out.println("Select option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    static void optionsMenu() {
        System.out.println();
        System.out.println("_______________________");
        System.out.println("-- Menu --");
        System.out.println();
        System.out.println("1 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Rename guest");
        System.out.println("4 - Reserve guest space");
        System.out.println("5 - Exit");

        System.out.println();
        System.out.println("_______________________");
        System.out.println("-- Guests --");

        System.out.println();
    }

    static void guestList() {
        if (guests[0] == null) {
            System.out.println("Guest list is empty");
        }
        for (int i = 0, j = 1; i < guests.length; i++, j++) {

            if (guests[i] != null) {
                System.out.println(guests[i] == null ? j + ". --" : j + ". " + guests[i]);
            }
        }
    }

    static void addGuest() {
        System.out.println("-- Booking --");
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Enter guests name:");
                String name = scanner.nextLine();
                guests[i] = name;
                break;
            }
        }
    }

    static void removeGuest() {
        System.out.println("-- Cancellation --");
        System.out.println("Enter guest number to remove:");
        int removal = scanner.nextInt();
        if (removal <= 10 && removal >= 1 && guests[removal - 1] != null) {
            for (int i = 0; i <= guests.length; i++) {
                if (guests[i] != null && i + 1 == removal) {
                    guests[i] = null;
                    break;
                }
            }
            for (int i = 0; i < guests.length - 1; i++) {
                if (guests[i] == null) {
                    guests[i] = guests[i + 1];
                    guests[i + 1] = null;
                }
            }
            System.out.println("_______________________");
        } else {
            System.out.println("Invalid selection, please check the guest number");
        }
    }

    static void insertTestNames() {
        guests[0] = "Ste";
        guests[1] = "Fra";
        guests[2] = "Ale";
        guests[3] = "Mat";
        guests[4] = "Ton";
    }

    static void rename() {
        System.out.println("Please rename the guest in number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < guests.length - 1; i++) {
            if (number <= 10 && number >= 1 && guests[number - 1] != null) {
                if (number == i + 1) {
                    System.out.println("Please type in the amended name: ");
                    String rename = scanner.nextLine();
                    guests[i] = rename;
                    break;
                }
            } else {
                System.out.println("Invalid selection, please check the guest number");
                break;
            }
        }
    }

    static void reserve() {
        System.out.println("Please enter the number of the space you wish to reserve: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number <= 10 && number >= 1 && guests[number - 1] != null) {
            System.out.println("Please enter the name of the guest ");
            String name = scanner.nextLine();
            for (int i = guests.length - 1; i > number - 1; i--) {
                guests[i] = guests[i - 1];
            }
            guests[number - 1] = name;
        }
        else {
            System.out.println("Invalid selection, please check the guest number");

        }
    }
}

