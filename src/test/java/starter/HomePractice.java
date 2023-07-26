package starter;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomePractice {
    public static void main(String[] args) {
//
        System.out.printf("byte minimum: %s, maximum %s%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short minimum: %s, maximum %s%n", Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.printf("int minimum: %s, maximum %s%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long minimum: %s, maximum %s%n", Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.printf("float minimum: %s, maximum %s%n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("double minimum: %s, maximum %s%n", Double.MIN_VALUE, Double.MAX_VALUE);

        float f = 123.456789012345678f;
        double d = 123.456789012345678;

        System.out.printf("f is %.99f %n", f);
        System.out.printf("d is %.99f %n", d);
        System.out.println("f is " +f);
        System.out.println("d is " +d);

        BigDecimal z = new BigDecimal("123.456789012345678901234567890");
        System.out.printf("z is: %.99f %n", z);

        double result1 = 0.1 * 7;
        double result2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;

        System.out.printf("result1: is %f %n", result1);
        System.out.printf("result2: is %f %n", result2);

        double difference = result1 - result2;
        System.out.printf("The difference between result1 and result2 is: %.99f %n", difference);

        int apples = 6;
        int oranges = 9;
        double applePrice = 12.60;
        double orangePrice = 4.50;


////        System.out.println(apples == oranges);
////        System.out.println(apples != oranges);
////
////        System.out.printf("%d > %d is %s %n", apples, oranges, apples > oranges);
////        System.out.printf("%d < %d is %s %n", apples, oranges, apples < oranges);
////        System.out.printf("%d >= %d is %s %n", apples, oranges, apples >= oranges);
////        System.out.printf("%d <= %d is %s %n", apples, oranges, apples <= oranges);
////
////        System.out.printf("Reducing apple cost: %s %n", (apples > oranges) || (applePrice > orangePrice));
//
//        boolean moreApples;
//        boolean applesAreDearer;
//
//        moreApples = (apples > oranges);
//        applesAreDearer = (applePrice > orangePrice);
//        System.out.printf("We have more apples: %s %n", moreApples);
//        System.out.printf("Apples are deared: %s %n", applesAreDearer);
//
////  System.out.printf("Reducing cost of apples: %s %n", (moreApples && applesAreDearer));
////  System.out.printf("Reducing cost of apples: %s %n", (moreApples || applesAreDearer));
//
//        boolean moreApplesAndDearer = moreApples && applesAreDearer;
//        boolean moreApplesOrDearer = moreApplesAndDearer || applesAreDearer;
//        System.out.printf("Reducing cost of apples: %s %n", moreApplesAndDearer);
//        System.out.printf("Reducing cost of apples: %s %n", moreApplesOrDearer);
//
//
//        //Casting narrowing & widing
//        double ageWithMonths = 27.4d;
//        int ageWithoutMonths = (int) ageWithMonths;
//        System.out.printf("age with months: %s %n", ageWithMonths);
//        System.out.printf("age without months: %s %n", ageWithoutMonths);
//
//        int fullNumber = 10;
//        double notFullNumber = fullNumber;
//        System.out.printf("full number: %s %n", fullNumber);
//        System.out.printf("not full number: %s %n", notFullNumber);
//
//
//        String courseName = "Learn Java for Beginners Crash Course";
//        String message = "Welcome to ";
//
//        System.out.println(courseName.charAt(0));
//
//        int lastPositionC = courseName.lastIndexOf("C");
//        System.out.println(lastPositionC);
//
//        for (int i = 15; i < courseName.length(); i++) {
//            System.out.print(courseName.charAt(i));
//        }
//
//        System.out.println("");
//
//        int position;
//        position = courseName.lastIndexOf(" C");
//        System.out.println(position);
//
//
//        //////////////Math exercises
//        //Calculate the area of a rectangle
        double length = 15.5;
        double width = 6.25;
        double area = length * width;
        System.out.println("Area of rectangle is: length * width " + area);


//        //Convert Celsius to Fahrenheit
        int Celsius = 1;
        int Fahrenheit = (int) (Celsius * 33.8);
        System.out.printf("Temperature in Celsius is: %s%nTemperature in Fahrenheit is: %s.%n", Celsius, Fahrenheit);

//        //Calculate the sum of digits (with scanner)
        Scanner scanner = new Scanner(System.in); //scanner object creation
        System.out.println("---Here starts the first Math Scanner exercise--");
        System.out.println("Add a value for the radius of the circle: "); //prompt scanner creation

        double radius = scanner.nextDouble(); //read the radius as a double with .nextDouble() function

        double areaCircle = Math.PI * radius * radius; // PI * R square
        System.out.println("The area of the circle is: " + areaCircle); //print
        System.out.println("---The first exercise is complete---");


//        //Multiple math operations using Scanner
        System.out.println("--Here starts the second Math Scanner exercise--");
        System.out.println("Insert the first number (e.g. double): "); //adding the first number
        double firstNumber = scanner.nextDouble(); //read the first number
        System.out.println("Insert the second number: "); //adding the second number
        double secondNumber = scanner.nextDouble(); //read the first number


        double sum = firstNumber + secondNumber; //calculating the sum
        double diff = firstNumber - secondNumber; //calculating the difference
        double product = firstNumber * secondNumber; //calculating the product
        double division = firstNumber / secondNumber; //calculating the division

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);
        System.out.println("---The second exercise is complete--");

        scanner.close();

        //Boolean exercises
        boolean greenLight = true;
        boolean pedestrian = false;
        boolean rightTurn = true;
        boolean otherLane = false;

        if (((rightTurn && !pedestrian) || otherLane) || (otherLane && !pedestrian && greenLight)) {
            System.out.println("You can go ahead");
        }else {
            System.out.println("You can't go ahead!");
        }



    }
}
