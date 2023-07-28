package starter.codingbatLogic1;

public class CaughtSpeeding {
    int speed = 84; // modify speed.     <60 = return 0;    61-80 = return 1;    +81 = return 2; unless it is birthday and get speedBonus 5 :) )
    int speedBonus = 0; //speedBonus will get extra 5 value if isBirthday is true
    boolean isBirthday = true;

    public static void main(String[] args) {
        CaughtSpeeding c = new CaughtSpeeding();

        if(c.isBirthday) {
            c.speedBonus = 5;
        }

        if (c.speed < 61 + c.speedBonus) {
            System.out.println(0);
        } else if (c.speed <81 + c.speedBonus) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }


    }
}
