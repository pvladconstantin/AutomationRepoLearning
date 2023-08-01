package starter.codingbatLogic1;

public class More20 {
    int n=20; //n = 20 for true. n = 21 for false

    public static void main(String[] args) {
        More20 c = new More20();

        if (c.n % 20 == 1) {
            System.out.println(true);
        } else if (c.n % 20 ==2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
