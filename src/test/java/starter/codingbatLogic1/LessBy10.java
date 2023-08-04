package starter.codingbatLogic1;

public class LessBy10 { //Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
    int a=1;
    int b=7;
    int c=10;

    public boolean Method () {
        return (a - b >= 10 || a - c >= 10 || b - c >= 10 || b - a >= 10 || c - a >= 10 || c - b >= 10);
    }

    public static void main(String[] args) {
        LessBy10 execute = new LessBy10();
        System.out.println(execute.Method());
    }
}
