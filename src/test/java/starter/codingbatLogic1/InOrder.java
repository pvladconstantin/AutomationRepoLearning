package starter.codingbatLogic1;

public class InOrder {
    int a=1;//true if b is greater than a, and c is greater than b.  if "bOk" is true, b does not need to be greater than a
    int b=2;
    int c=4;
    boolean b0k = false;

    public static void main(String[] args) {
        InOrder c = new InOrder();

        if (c.b0k) {
            System.out.println(c.b < c.c);
        } else {
            System.out.println(c.a < c.b && c.b < c.c);
        }

    }
}
