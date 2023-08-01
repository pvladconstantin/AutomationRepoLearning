package starter.codingbatLogic1;

public class LastDigit {
    int a=242; //Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative.
    int b=163;
    int c=102; // 242 and 102 has the same last digit -> return true.

    public static void main(String[] args) {
        LastDigit c = new LastDigit();
        if ((c.a % 10 == c.b % 10) || (c.b % 10 == c.c % 10) || (c.c % 10 == c.a % 10)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
