package starter.codingbatLogic1;

//a and b, return their sum, so long as the sum has the same number of digits as a.
//If the sum has more digits than a, just return a without b.
//Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and
// then check the length of the string.)
public class SumLimit {
    int a=8; // for 8 & 3 it will return 8 since 8+3 = 11 (two digits)
    int b=3;
    int sum = a + b;
    int aDigits = String.valueOf(a).length(); // get
    int sumDigits = String.valueOf(sum).length();

    public int Method() {
        if (sumDigits == aDigits) { // if number of digits from the sum matches the number of digits of "a" int
            return sum; // Return the sum
        } else {
            return a; // Return a without b
        }
    }

    public static void main(String[] args) {
        SumLimit execute = new SumLimit();
        System.out.println(execute.Method());
    }

}

