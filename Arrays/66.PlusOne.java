/* 66. Plus One
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].  */


import java.util.*;

public class IncrementDigits {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the end to the beginning
        for (int i = n - 1; i >= 0; i--) {
            // If digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Else, set to 0 and continue the loop to carry the 1
            digits[i] = 0;
        }

        // If all digits were 9, we need an extra digit in front
        int[] result = new int[n + 1];
        result[0] = 1;  // All other digits are already 0 by default
        return result;
    }

    // For testing
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(digits))); // Output: [1, 2, 4]
    }
}
