package starter.codingbatLogic1;

public class GreenTicket {
    int a;
    int b;
    int c;

    public int Method(int a, int b, int c) {
        if ((a != b) && (b != c) && (a != c)) {
            return 0;
        } else if ((a == b) && (b == c) && (a == c)) {
            return 20;
        } else {
            return 10;
        }
    }

    public static void main(String[] args) {
        GreenTicket execute = new GreenTicket();
        System.out.println(execute.Method(1, 2, 3));
        System.out.println(execute.Method(2, 2, 2));
        System.out.println(execute.Method(1, 1, 2));

    }
}
