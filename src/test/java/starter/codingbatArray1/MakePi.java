package starter.codingbatArray1;

import java.util.Arrays;

public class MakePi {

    public int[] makePi() {

        int[] piArray = {3, 1, 4};
        return  piArray;
    }

    public static void main(String[] args) {
        MakePi test = new MakePi();
        System.out.println(Arrays.toString(test.makePi())); //using Arrays.toString to proper printing the array.
    }
}
