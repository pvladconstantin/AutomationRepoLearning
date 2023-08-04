package starter.codingbatString1;

public class WithoutX {
    String str="xoxnox";//if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged

    public String Method() {
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1); // Remove first 'x'
        }
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1); // Remove last 'x'
        }
        return str;
    }

    public static void main(String[] args) {
        WithoutX execute = new WithoutX();
        System.out.println(execute.Method());
    }
}
