package starter.codingbatString1;

public class MinCat {

    public String a="Hello";
    public String b="Hi";

    public String Method(){
        if (a.length() == b.length()) {
            return a + b;
        } else {
            if (a.length() > b.length()) {
                return a.substring(a.length() - b.length()) + b;
            } else {
                return a + b.substring(b.length() - a.length());
            }
        }
    }

    public static void main(String[] args) {
        MinCat execute = new MinCat();
        System.out.println(execute.Method());
    }
}
