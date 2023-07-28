package starter.codingbatString1;

public class SeeColor {
    String str = "redxx";

    public static void main(String[] args) {
        SeeColor c = new SeeColor();

        if(c.str.startsWith("red")) {
            System.out.println(true);
        } else if (c.str.startsWith("blue")) {
            System.out.println("blue");
        }
        System.out.println("");
    }
}
