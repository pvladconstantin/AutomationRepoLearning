package starter.codingbatLogic1;

public class BlueTicket {
    int a=15;
    int b=2;
    int c=5;

    public static void main(String[] args) {
        BlueTicket c = new BlueTicket();
        if (c.a + c.b == 10 || c.c + c.a == 10 || c.b + c.c == 10) {
            System.out.println(10);
        } else if (c.a + c.b == c.b + c.c + 10 || c.a + c.b == c.a + c.c + 10) {
            System.out.println(5);
        } else {
            System.out.println(0);
        }
    }
}
