package starter.codingbatLogic1;

import java.util.Date;

public class DateFashion {
    int you=4;
    int date=2;

    public static void main(String[] args) {
        DateFashion c = new DateFashion();

        if ((c.you >= 8 && c.date >2) || (c.date >=8 && c.you >2)) {
            System.out.println(2);
        } else if (c.you <= 2 || c.date <=2) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
