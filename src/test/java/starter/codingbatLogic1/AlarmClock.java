package starter.codingbatLogic1;

public class AlarmClock {
    int day=1; //0=sunday ;  6= sat.
    boolean vacation=false;

    public static void main(String[] args) {
        AlarmClock c = new AlarmClock();


        if (c.vacation) {
            if (c.day == 0 || c.day == 6) {
                System.out.println("off");
            } else {
                System.out.println("10:00");
            }
        } else {
            if (c.day == 0 || c.day == 6) {
                System.out.println("10:00");
            } else {
                System.out.println("7:00");
            }
        }
    }
}
