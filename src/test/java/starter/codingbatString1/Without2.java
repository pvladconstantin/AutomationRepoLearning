package starter.codingbatString1;

import com.vladsch.flexmark.ext.wikilink.WikiImage;

public class Without2 {
    String str="HelloHe";

    public String Method(){
        if (str.length() >= 2 && str.startsWith(str.substring(str.length() - 2))) {
            return str.substring(2);
        }
        return str;
    }

    public static void main(String[] args) {
        Without2 execute = new Without2();
        System.out.println(execute.Method());
    }

}
