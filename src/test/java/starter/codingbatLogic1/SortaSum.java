package starter.codingbatLogic1;

public class SortaSum {
    int a=10; // if sum is between 10-19 -> return 20.   else -> return sum
    int b=2;
    int sum = a + b;

    public static void main(String[] args) {
        SortaSum c = new SortaSum();

        if (c.sum >= 10 && c.sum <= 19) {
            System.out.println(20);
        } else {
            System.out.println(c.sum);
        }
    }
}
