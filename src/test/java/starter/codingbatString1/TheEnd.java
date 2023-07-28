package starter.codingbatString1;

public class TheEnd {
    String str = "Hello";
    boolean front = true; //modify here from true to false

    public static void main(String[] args) {
        TheEnd c = new TheEnd();
        if(c.front == true) {
            System.out.println(c.str.substring(0,1));
        } else {
            System.out.println(c.str.substring(c.str.length()-1));
        }
    }
}

