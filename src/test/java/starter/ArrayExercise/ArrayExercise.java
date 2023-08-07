package starter.ArrayExercise;

public class ArrayExercise {
    public static void main(String[] args) {
        int a = 1;              // Declare and initialize an integer variable 'a' with the value 1.
        int[] ia = new int[10]; // Declare and initialize an integer array 'ia' with a length of 10.
        int b = ia[a];          // Access the element at index 1 (value of 'a') in array 'ia' and store it in 'b'.
        int c = b + a;          // Add the value of 'b' (element at index 1 of 'ia') with the value of 'a' and store the result in 'c'.
        System.out.println(b = c); // Print the value of 'b' after assigning it the value of 'c'. This expression first assigns 'b' the value of 'c' and then prints the new value of 'b'.
    }
}

