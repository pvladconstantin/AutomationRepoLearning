package starter.codingbatLogic1;

public class FizzString2 {
    int n=15;

    public String Method() {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }

    public static void main(String[] args) {
        FizzString2 execute = new FizzString2();
        System.out.println(execute.Method());
    }

}
