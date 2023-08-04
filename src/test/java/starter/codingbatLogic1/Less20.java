package starter.codingbatLogic1;

import org.jline.builtins.Less;

public class Less20 {
    int n=18; // if remainder = 18 or 19 (number is 1 or 2 less than a multiple of 20) - return true ; else - return false
    int remainder = n % 20;

    public boolean Method(){
        int remainder = n % 20;
        if (remainder == 18 || remainder == 19) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Less20 execute = new Less20();
        System.out.println(execute.Method());
    }
}
