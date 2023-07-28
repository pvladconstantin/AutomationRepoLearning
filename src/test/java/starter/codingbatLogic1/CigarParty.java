package starter.codingbatLogic1;

public class CigarParty {
    int cigars = 70; //set for 30, 50 or 70
    boolean isWeekend = true; // set true or false

    public static void main(String[] args) {
        CigarParty c = new CigarParty();

        if(c.isWeekend == true & c.cigars >=40) {
            System.out.println(true);
        } else if (!c.isWeekend && c.cigars >=40 && c.cigars <=60) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
