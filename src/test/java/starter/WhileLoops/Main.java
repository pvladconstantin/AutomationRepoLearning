package starter.WhileLoops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String userChoice;
        System.out.println("Please choose one of the following options:");
        System.out.println("1- Cappucino");
        System.out.println("2- Latte");
        System.out.println("3- Americano");
        System.out.println("4- Mocha");
        System.out.println("Q- Quit the program");


        do {
            userChoice = scanner.nextLine();
            userChoice = userChoice.toLowerCase();
            System.out.println("You chose: " + userChoice);

            switch (userChoice) {
                case "1":
                    System.out.println("Making Cappucino");
                    break;

                case "2":
                    System.out.println("Making Latte");
                    break;

                case "3":
                    System.out.println("Making Americano");
                    break;

                case "4":
                    System.out.println("Making Mocha");
                    break;

                default:
                    System.out.println("Returning coins and quitting the program.");
                    continue;
            }

            System.out.println("Dispensing coffee");
            System.out.println("Have a nice day!");


        } while (!userChoice.equalsIgnoreCase("q"));

        scanner.close();

    }

}