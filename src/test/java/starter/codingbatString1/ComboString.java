package starter.codingbatString1;

public class ComboString {
    String a = "Hello";
    String b = "hi";

    public String method() {
        if (a.length() < b.length()) {
            return a + b + a;
        } else if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return "";
        }
    }


    public static void main(String[] args) {
        ComboString c = new ComboString();

        System.out.println(c.method());
    }
}
