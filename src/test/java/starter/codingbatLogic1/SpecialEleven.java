package starter.codingbatLogic1;

import freemarker.template.utility.Execute;

public class SpecialEleven {
    int n = 22; //22 true - 24 false

    public boolean Method() {
        return n % 11 == 0 || n % 11 == 1;
    }

    public static void main(String[] args) {

        SpecialEleven execute = new SpecialEleven();

        System.out.println(execute.Method());
    }
}
