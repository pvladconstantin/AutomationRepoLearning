package starter.codingbatLogic1;

public class Old35 {
    int n=3; //test with n=15 for false

    public static void main(String[] args) {
        Old35 c = new Old35();

        System.out.println((c.n % 3 == 0) != (c.n % 5 == 0));
    }
}
