package starter.ElizaDebugCourse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println(Doctor.intro());

        var userInput = "";

        do {
            userInput = scanner.nextLine();
            String response = Doctor.response(userInput);
            System.out.println(response);
        } while (!userInput.equalsIgnoreCase("quit"));

        scanner.close();
    }
}
