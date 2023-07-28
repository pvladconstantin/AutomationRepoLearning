package starter.codingbatString1;

public class ExtraEnd {
    String str = "Hello";
    String strEnd = str.substring(str.length() - 2);

    public static void main(String[] args) {
        ExtraEnd c = new ExtraEnd();
        System.out.println(c.strEnd + c.strEnd + c.strEnd);

    }
}
