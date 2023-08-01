package starter.codingbatString1;

public class ComboString {
    String a = "Hello";
    String b = "hi";

    public static void main(String[] args) {
        ComboString c = new ComboString();

        if (c.a.length() < c.b.length()) {
            System.out.println(c.a + c.b + c.a);
        } else if (c.a.length() > c.b.length()) {
            System.out.println(c.b + c.a + c.b);
        } else {
            System.out.println("");
        }
    }
}
