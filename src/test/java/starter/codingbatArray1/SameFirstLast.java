package starter.codingbatArray1;

import org.mockito.internal.matchers.Same;

public class SameFirstLast {

    public boolean SameFirstLast(int[] nums) {
        int l = nums.length;

        if (l > 0 && nums[0] == nums[l - 1]) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        SameFirstLast test = new SameFirstLast();

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 1};
        int[] arr3 = {1, 2, 1};
        int[] arr4 = {};

        System.out.println(test.SameFirstLast(arr1));// false as the array is length 1 at least and the first element != last element;
        System.out.println(test.SameFirstLast(arr2));// true  as the array is length 1 at least and the first element = last element;
        System.out.println(test.SameFirstLast(arr3));// true  as the array is length 1 at least and the first element = last element;
        System.out.println(test.SameFirstLast(arr4));// false as the length is less than 1;


    }
}
