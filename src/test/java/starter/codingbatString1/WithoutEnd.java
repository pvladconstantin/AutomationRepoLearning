package starter.codingbatString1;

public class WithoutEnd {
    String str = "Hello";

    public static void main(String[] args) {
        WithoutEnd c = new WithoutEnd();
        System.out.println(c.str.substring(1, c.str.length()-1));

    }
}
