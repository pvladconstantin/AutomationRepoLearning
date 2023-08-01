package starter.codingbatLogic1;

import io.cucumber.java.bs.I;

public class In1to10 {
    int n=11; //return true if n is in the range 1..10, inclusive.
    boolean outsideMode=true; //Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.

    public static void main(String[] args) {
        In1to10 c = new In1to10();

        if (!c.outsideMode && c.n >= 1 && c.n <= 10) {
            System.out.println(true);
        } else if (c.outsideMode && (c.n <= 1 || c.n >= 10)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
