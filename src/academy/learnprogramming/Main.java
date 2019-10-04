package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Phone phone = new phone("0039 330 4404");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
            }
        }
    }

    private static void printContacts() {
        phone.printContacts();
    }

    public static void startPhone() {
        System.out.println("Starting phone...");
    }

    public static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                            "1 - to print contacts\n" +
                            "2 - to add a new contact\n" +
                            "3 - to update an existing contact\n" +
                            "4 - to remove an existing contact\n" +
                            "5 - to query if an existing contact exists\n" +
                            "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }


}
