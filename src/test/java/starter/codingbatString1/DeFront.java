package starter.codingbatString1;

public class DeFront {
    String str = "away";

    public String Method() {
        if (str.length() >= 2) { // Check if the length of the string is greater than or equal to 2
            boolean a = str.charAt(0) == 'a'; // Check if the first character of the string is 'a'
            boolean b = str.charAt(1) == 'b'; // Check if the second character of the string is 'b'

            if (a && b) // If both 'a' and 'b' conditions are true
                return str; // Return standard str (away)
            if (a) // If a = true
                return "a" + str.substring(2); // string starting with "a" + the substring from the 3rd character first of 'str'
            if (b) // If b = true
                return "b" + str.substring(2); // string starting with 'b' + the substring from the 3rd character first of 'str'
            return str.substring(2); // return the substring from the 3rd character first of 'str'
        } else {
            if (str.length() == 1) { // if the str = 1
                if (str.charAt(0) == 'a')
                    return "a"; // If the first character of 'str' is 'a', return "a"
                if (str.charAt(0) == 'b')
                    return "b"; // If the first character of 'str' is 'b', return "b"
            }
        }
        return str; // Return the original string 'str' if its length is less than 2 and it is not a single character 'a' or 'b'
    }

    public static void main(String[] args) {
        DeFront execute = new DeFront();
        System.out.println(execute.Method());
    }
}
