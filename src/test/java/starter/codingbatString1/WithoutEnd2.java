package starter.codingbatString1;

public class WithoutEnd2 {
    String str = "Hello"; //test with "hello" "hel" "el"

    public static void main(String[] args) {
        WithoutEnd2 c = new WithoutEnd2();

        if(c.str.length() <= 1){
            System.out.println("");
        } else {
            System.out.println(c.str.substring(1, c.str.length()-1));
        }
    }
}
