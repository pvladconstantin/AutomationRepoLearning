package starter.codingbatString1;

public class FirstHalf {
    String str = "WooHoo";
    String firstHalf = str.substring(0,(str.length()/2));

    public static void main(String[] args) {
        FirstHalf c = new FirstHalf();
        System.out.println(c.firstHalf);
    }
}

