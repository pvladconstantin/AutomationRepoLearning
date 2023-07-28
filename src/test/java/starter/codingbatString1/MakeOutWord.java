package starter.codingbatString1;

public class MakeOutWord {
    String out = "<<>>";
    String word = "Yay";

    public static void main(String[] args) {
        MakeOutWord c = new MakeOutWord();
        System.out.println(c.out.substring(0,2 ) + c.word  + c.out.substring(2));
    }
}
