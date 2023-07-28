package starter.codingbatString1;

public class StartWord {
    String str = "hippo";
    String word = "hi"; //modify with hi, hip or h

    String firstCharStr = str.substring(1);
    String firstCharWord = word.substring(1);

    public static void main(String[] args) {
        StartWord c = new StartWord();

        if (c.str.length() == 0 || c.word.length() < 1) {
            System.out.println("");
        } else if (c.str.startsWith(c.word)) {
            System.out.println(c.word);
        } else if (c.firstCharStr.startsWith(c.firstCharWord)) {
            System.out.println(c.str.substring(0, c.word.length()));
        } else {
            System.out.println("");
        }

    }
}
