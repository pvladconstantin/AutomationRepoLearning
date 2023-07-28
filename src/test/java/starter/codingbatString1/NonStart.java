package starter.codingbatString1;

public class NonStart {
    String a = "Hello";
    String b = "There";
    String aNew = a.substring(1, a.length());
    String bNew = b.substring(1, b.length());

    public static void main(String[] args) {
        NonStart c = new NonStart();
        System.out.println(c.aNew + c.bNew);
    }
}
