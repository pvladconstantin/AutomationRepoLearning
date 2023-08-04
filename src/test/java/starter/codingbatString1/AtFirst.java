package starter.codingbatString1;

public class AtFirst {

    String str="h"; //return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.

    public String Method() {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@@";
        }
    }

    public static void main(String[] args) {
        AtFirst execute = new AtFirst();
        System.out.println(execute.Method());
    }
}
