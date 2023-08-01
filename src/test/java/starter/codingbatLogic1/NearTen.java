package starter.codingbatLogic1;

public class NearTen {
    int num = 22; // if the remainder is within 2 of a multiple of 10 -> return true; else - false

    public static void main(String[] args) {
        NearTen c = new NearTen();

        if ((c.num % 10 == 8) || (c.num % 10 == 9) || (c.num % 10 == 0) || (c.num % 10 == 1) || (c.num % 10 == 2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
