package starter.ArrayAndArrayLists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create an array of strings named 'originalArray'
        String[] originalArray = new String[]{"First", "Second", "Third"};

        // Convert 'originalArray' to a List using Arrays.asList() method
        var originalList = Arrays.asList(originalArray);

        // Modify the first element of 'originalList'
        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        // Sort 'originalList' in natural order
        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

        // Create a new List 'newList' using Arrays.asList() method
        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

    }
}
