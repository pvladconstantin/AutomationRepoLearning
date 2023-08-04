package starter.codingbatString1;

public class LastTwo {
    String str="coding"; //return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
    int length = str.length();
    public String Method() {

    if (length >= 2) {
        String lastTwoChars = str.substring(length - 2);
        return str.substring(0, length - 2) + lastTwoChars.charAt(1) + lastTwoChars.charAt(0);
    }
    return str;
    }

    public static void main(String[] args) {
        LastTwo execute = new LastTwo();
        System.out.println(execute.Method());
    }
}
