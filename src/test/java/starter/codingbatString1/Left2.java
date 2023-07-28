package starter.codingbatString1;

public class Left2 {
    String str = "Hello";
    String firstTwo = str.substring(0,2);
    String lastTwo = str.substring(2, str.length());

    public static void main(String[] args) {
        Left2 c = new Left2();
        System.out.println(c.lastTwo+c.firstTwo);
    }
}

