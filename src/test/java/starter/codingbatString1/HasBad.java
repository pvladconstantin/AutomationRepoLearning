package starter.codingbatString1;

public class HasBad {
    String str = "badxx"; //use badxx for true, use xbadxx for true, use xxbadxx for false

    public static void main(String[] args) {
        HasBad c = new HasBad();

        if(c.str.length() < 3) {
            System.out.println(false);
        } else if (c.str.substring(0,3).equals("bad")) {
            System.out.println(true);
        } else if (c.str.length() > 3) {
            if (c.str.substring(1,4).equals("bad")) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
