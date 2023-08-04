package starter.codingbatLogic1;

public class RedTicket {
    int a=2;
    int b=2;
    int c=1;

    public int Method () {
        if (a == 2 && b == 2 && c == 2) {
            return 10; // If all three values are 2 - return 10
        } else if (a == b && b == c) {
            return 5; // If all three values are the same - return 5
        } else if (a != b && a != c) {
            return 1; // If a is different from both b and c - return 1
        } else {
            return 0; // For all other cases, return 0
        }
    }

    public static void main(String[] args) {
        RedTicket execute = new RedTicket();
        System.out.println(execute.Method());
    }

}

