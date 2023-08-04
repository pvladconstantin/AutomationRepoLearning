package starter.codingbatString1;

public class ConCat {
    String a="abc";
    String b="cat";

    public String Method() {

        if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }
        return a + b;
    }

    public static void main(String[] args) {
        ConCat execute = new ConCat();
        System.out.println(execute.Method());
    }
}
