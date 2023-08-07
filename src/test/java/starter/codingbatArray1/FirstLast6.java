package starter.codingbatArray1;

public class FirstLast6 {

    public boolean firstLast6(int[] nums) {
        int l = nums.length;

        if (nums[0] == 6 || nums[l - 1] == 6) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        FirstLast6 test = new FirstLast6();

        // Test cases
        int[] arr1 = {1, 2, 6};
        int[] arr2 = {6, 1, 2, 3};
        int[] arr3 = {13, 6, 1, 2, 3};

        System.out.println(test.firstLast6(arr1));//true as 6 is the last element of array
        System.out.println(test.firstLast6(arr2)); //true as 6 is the first element of array
        System.out.println(test.firstLast6(arr3)); //false as 6 is not first or last element of array
    }
}

