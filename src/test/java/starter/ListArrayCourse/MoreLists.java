package starter.ListArrayCourse;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        // Declare and initialize an array of strings named 'items'
        String[] items = {"apples", "bananas", "milk", "eggs"};

        // Create an immutable list named 'list' using the 'List.of()' method and pass the 'items' array to it
        List<String> list = List.of(items);

        // Print the contents of the 'list'
        System.out.println(list);

        // Create a new mutable ArrayList named 'groceries' and initialize it with the contents of the 'list'
        ArrayList<String> groceries = new ArrayList<>(list);

        // Add the string "yogurt" to the 'groceries' ArrayList
        groceries.add("yogurt");

        // Print the contents of the 'groceries' ArrayList
        System.out.println(groceries);

        // Create a new mutable ArrayList named 'nextList' and initialize it with a new list containing "pickles", "mustard", and "cheese"
        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));

        // Print the contents of the 'nextList' ArrayList
        System.out.println(nextList);

        // Add all the elements from 'nextList' to the 'groceries' ArrayList
        groceries.addAll(nextList);

        // Print the updated contents of the 'groceries' ArrayList
        System.out.println(groceries);

        System.out.println("Third item = " + groceries.get(2)); // Print the third item in the list

        if (groceries.contains("mustard")) { // Check if the list contains "mustard"
            System.out.println("List contains mustard");
        }

        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt")); // Print the index of the first occurrence of "yogurt"
        System.out.println("last = " + groceries.lastIndexOf("yogurt")); // Print the index of the last occurrence of "yogurt"

        System.out.println(groceries);
        groceries.remove(1); // Remove the element at index 1 (second element)
        System.out.println(groceries);
        groceries.remove("yogurt"); // Remove the first occurrence of "yogurt"
        System.out.println(groceries);

        groceries.removeAll(List.of("apples", "eggs")); // Remove all occurrences of specified elements
        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese")); // Retain only the specified elements
        System.out.println(groceries);

        groceries.clear(); // Clear the list
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty()); // Check if the list is empty

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        System.out.println(groceries);
        groceries.sort((Comparator.naturalOrder())); // Sort the list in natural order
        System.out.println(groceries);

        groceries.sort((Comparator.reverseOrder())); // Sort the list in reverse order
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]); // Convert the list to an array
        System.out.println(Arrays.toString(groceryArray));
    }
}