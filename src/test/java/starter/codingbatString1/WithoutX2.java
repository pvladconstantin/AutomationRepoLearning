package starter.codingbatString1;

public class WithoutX2 {
    String str="xHi";

    public String Method() {
        if (str.length() == 0)
            return "";

        // Check if the string length is 1, return the string if it is not x
        if (str.length() == 1 && str.charAt(0) != 'x')
            return str;

        // Check if the first character is 'x'
        boolean firstCharIsX = str.charAt(0) == 'x';
        // Check if the second character is 'x'
        boolean secondCharIsX = str.length() >= 2 && str.charAt(1) == 'x';

        // If both the first and second characters are 'x', return substring from the 3rd character
        if (firstCharIsX && secondCharIsX)
            return str.substring(2);
            // If only the first character is 'x', return substring from the 2nd character
        else if (firstCharIsX)
            return str.substring(1);
            // If only the second character is 'x', return substring with the first character and the 3rd character
        else if (secondCharIsX)
            return str.charAt(0) + str.substring(2);

        // If first two chars are not X, return original string
        return str;
    }

    public static void main(String[] args) {
        WithoutX2 execute = new WithoutX2();
        System.out.println(execute.Method());
    }
}
