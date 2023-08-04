package starter.codingbatString1;

public class Right2 {
    String str="Hello";//return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
    int length = str.length();
    String lastTwoChars = str.substring(length - 2);

    public String Method() {
        return lastTwoChars + str.substring(0, length - 2);
    }

    public static void main(String[] args) {
        Right2 execute = new Right2();
        System.out.println(execute.Method());
    }
}
