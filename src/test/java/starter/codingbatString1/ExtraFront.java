package starter.codingbatString1;

public class ExtraFront {
    String str = "Hello";
    String twoChars = str.substring(0,2);

    public static void main(String[] args) {
        ExtraFront c = new ExtraFront();

        if (c.str.length()<2) {
            System.out.println(c.str + c.str + c.str);
        } else {
            System.out.println(c.twoChars + c.twoChars + c.twoChars);
        }

    }
}
