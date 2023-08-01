package starter.codingbatLogic1;

public class Love6 {
    int a=4; //replace a or b with 6, or add a + b values to == 6 (e.g. a=2, b=4) for returning TRUE;
    int b=6;

    public static void main(String[] args) {
        Love6 c = new Love6();

        if(c.a == 6 || c.b == 6) {
            System.out.println(true);
        } else if (c.a + c.b == 6) {
            System.out.println(true);
        } else if (c.a - c.b == 6 || c.b - c.a ==6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
