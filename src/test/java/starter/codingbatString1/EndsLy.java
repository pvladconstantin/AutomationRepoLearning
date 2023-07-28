package starter.codingbatString1;

public class EndsLy {
    String str = "oddly"; //replace last two characters ly with other characters to get false boolean
    String ly = "ly";
    int sizeString = str.length();

    public static void main(String[] args) {
        EndsLy c = new EndsLy();

        if (c.sizeString < 2) {
            System.out.println(false);
        } else if (c.ly.equals(c.str.substring(c.sizeString - 2, c.sizeString))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}




