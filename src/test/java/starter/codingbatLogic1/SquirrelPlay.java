package starter.codingbatLogic1;

public class SquirrelPlay {

    int temp=95;
    boolean isSummer=false;
    int upperLimit;


    public boolean Method() {
        if (isSummer) {
            upperLimit = 100;
        } else {
            upperLimit = 90;
        }
        return temp >= 60 && temp <= upperLimit;
    }

    public static void main(String[] args) {
        SquirrelPlay execute = new SquirrelPlay();
        System.out.println(execute.Method());
    }
}
