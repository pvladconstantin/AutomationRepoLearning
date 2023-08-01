package starter.codingbatString1;

public class FirstTwo {
    String str="Hello";

    public static void main(String[] args) {
        FirstTwo c = new FirstTwo();

        if (c.str.length() < 2) {
            System.out.println(c.str);
        } else {
            System.out.println(c.str.substring(0,2));
        }
    }
}
