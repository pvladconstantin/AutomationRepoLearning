package starter.ArrayListChallenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // Initialize a flag to control the loop
        boolean flag = true;

        // Create an ArrayList to store grocery items
        ArrayList<String> groceries = new ArrayList<>();

        // Start a loop for user interaction
        while (flag) {
            // Display available actions to the user
            printActions();

            // Read the user's choice of action
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries); // Call method to add items to the list
                case 2 -> removeItems(groceries); // Call method to remove items from the list
                default -> flag = false; // Exit the loop if the user enters an invalid choice
            }

            // Sort and print the current contents of the grocery list
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    // Method to add items to the grocery list
    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        // Iterate through the input items and add them to the list if not already present
        for (String i : items) {
            String trimmed = i.trim();
            if (!groceries.contains(trimmed)) {
                groceries.add(trimmed);
            }
        }
    }

    // Method to remove items from the grocery list
    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        // Iterate through the input items and remove them from the list
        for (String i : items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }

    // Method to display available actions to the user
    private static void printActions() {

        String textBlock = """
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""";
        System.out.print(textBlock + " ");
    }
}