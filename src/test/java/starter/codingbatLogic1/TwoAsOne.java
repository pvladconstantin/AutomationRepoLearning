package starter.codingbatLogic1;

public class TwoAsOne {
    int a = 1; //Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
    int b = 2;
    int c = 3;

    public static void main(String[] args) {
        TwoAsOne c = new TwoAsOne();
        if ((c.a + c.b == c.c) || (c.b + c.c == c.a) || (c.a + c.c == c.b)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
