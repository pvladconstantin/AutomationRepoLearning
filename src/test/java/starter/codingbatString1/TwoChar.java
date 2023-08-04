package starter.codingbatString1;

public class TwoChar {

// return a string length 2 starting at the given index.
// If the index is too big or too small to define a string length 2, use the first 2 chars.
// The string length will be at least 2.
    String str = "java";
    int index=3;
    int length = str.length();

    public String Method() {
        if (index >= 0 && index + 1 < length) {
            return str.substring(index, index + 2);
        }
        return str.substring(0, 2);
    }

    public static void main(String[] args) {
        TwoChar execute = new TwoChar();
        System.out.println(execute.Method());
    }
}
