package starter.codingbatString1;

public class LastChars {
    String a = "last";
    String b = "chars";

    public static void main(String[] args) {
        LastChars c = new LastChars();

        if(c.a.length() == 0){
            c.a = "@";
        } else if(c.b.length() == 0){
            c.b = "@";
        }

        System.out.println(c.a.substring(0,1) + c.b.substring(c.b.length()-1, c.b.length()));

    }
}
