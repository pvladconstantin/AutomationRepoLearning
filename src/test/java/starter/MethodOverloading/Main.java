package starter.MethodOverloading;

import io.cucumber.java.ca.Cal;

public class Main {

    public static void main(String[] args) {
        Calculator overloadingCalculator = new Calculator();

        int sumInt = overloadingCalculator.add(5, 10);
        System.out.println("Sum of integers: " + sumInt);

        double sumDouble = overloadingCalculator.add(3.5, 2.0);
        System.out.println("Sum of doubles: " + sumDouble);

        String concatenatedString = overloadingCalculator.add("Hello", "World");
        System.out.println("Concatenated string: " + concatenatedString);
    }
    public static class Calculator {

        public int add(int a, int b) {
            return a + b;
        }
        public double add(double a, double b) {
            return a + b;
        }
        public String add(String a, String b) {
            return a + b;
        }
    }
}
