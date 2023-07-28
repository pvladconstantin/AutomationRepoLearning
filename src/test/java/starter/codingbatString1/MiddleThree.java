package starter.codingbatString1;

public class MiddleThree {
    String str = "candy";
    int centerOfWord = str.length() / 2;

    public static void main(String[] args) {
        MiddleThree c = new MiddleThree();
        System.out.println(c.str.substring(c.centerOfWord-1, c.centerOfWord+2));
    }
}
