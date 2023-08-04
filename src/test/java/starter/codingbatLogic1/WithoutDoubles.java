package starter.codingbatLogic1;

import starter.codingbatString1.WithoutX2;


//Return the sum of two 6-sided dice rolls, each in the range 1..6.
// However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
public class WithoutDoubles {
    int die1=6;
    int die2=6;
    boolean noDoubles=true;

    public int Method() {
        if (noDoubles && die1 == die2) {
            if (die1 == 6) {
                die1 = 1; // If die1 is 6, set it to 1 to wrap around.
            } else {
                die1++; // Increment die1 to the next value.
            }
        }
        return die1 + die2;
    }

    public static void main(String[] args) {
        WithoutDoubles execute = new WithoutDoubles();
        System.out.println(execute.Method());
    }
}
