package starter.codingbatString1;

public class MiddleTwo {
    String str="string";
    int middleIndex= str.length() / 2;

    public static void main(String[] args) {
        MiddleTwo c = new MiddleTwo();

        System.out.println(c.str.substring(c.middleIndex - 1, c.middleIndex + 1));
    }
}
