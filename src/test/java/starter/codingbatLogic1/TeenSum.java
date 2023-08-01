package starter.codingbatLogic1;

public class TeenSum {
    int a=13; //adding any value to a or b which is in range 13-19 will always print "19"
    int b=5;

    public static void main(String[] args) {
        TeenSum c = new TeenSum();
        if((c.a >= 13 && c.a <= 19) || (c.b >= 13 && c.b <=19)) {
            System.out.println("19");
        } else {
            System.out.println(c.a+c.b);
        }
    }
}
