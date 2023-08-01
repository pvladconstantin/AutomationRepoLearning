package starter.codingbatLogic1;

public class FizzString {
    String str = "fablab"; //string starts with "f" return "Fizz". string ends with "b" return "Buzz". if "f" and "b" - return "FizzBuzz"



    public static void main(String[] args) {
        FizzString c = new FizzString();

        if ((c.str.startsWith("f") && (c.str.endsWith("b")))) {
            System.out.println("FizzBuzz");
        } else if (c.str.startsWith("f")) {
            System.out.println("Fizz");
        } else if (c.str.endsWith("b")) {
            System.out.println("Buzz");
        } else {
            System.out.println(c.str);
        }

    }
}
