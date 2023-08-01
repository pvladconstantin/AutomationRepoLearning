package starter.codingbatLogic1;

public class TeaParty {
    int tea=5;  //return in sout 0=bad, 1=good, or 2=great
    int candy=9;

    public static void main(String[] args) {
        TeaParty c = new TeaParty();

        if (c.tea < 5 || c.candy < 5) {
            System.out.println(0);
        } else if (c.tea >= c.candy * 2 || c.candy >= c.tea *2) {
            System.out.println(2);
        } else if (c.tea >= 5 || c.candy >= 5) {
            System.out.println(1);
        } else {
            System.out.println("other party situation");
        }
    }
}
