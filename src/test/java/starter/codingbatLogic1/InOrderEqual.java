package starter.codingbatLogic1;

public class InOrderEqual {
    //Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7.
    //However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.

    int a=2;
    int b=5;
    int c=11;
    boolean equalOk=false;

    public boolean Method() {
        if (equalOk) {
            return (a <= b && b <= c);
        } else {
            return (a < b && b < c);
        }
    }

    public static void main(String[] args) {
        InOrderEqual execute = new InOrderEqual();
        System.out.println(execute.Method());
    }
}
