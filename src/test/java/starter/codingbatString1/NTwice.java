package starter.codingbatString1;

public class NTwice {
    String str = "Hello";
    int n = 2;

    String firstChars = str.substring(0,n);
    String lastChars = str.substring(str.length()-n);

    public static void main(String[] args) {
        NTwice c = new NTwice();
        System.out.println(c.firstChars + c.lastChars);
    }

}
