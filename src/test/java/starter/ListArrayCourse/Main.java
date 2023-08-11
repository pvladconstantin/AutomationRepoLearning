package starter.ListArrayCourse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {

    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE",5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList(); //raw version of the array list
        objectList.add(new GroceryItem("Butter")); //adding new item to Array
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter")); //adding new item to Array
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE" , 5));
        groceryList.set(0, new GroceryItem("apples", "PRODUCE", 6));
        groceryList.remove(1);
        System.out.println(groceryList);
    }
}
