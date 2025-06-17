/* Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Example :
Input: nums = [2,2,1]
Output: 1 */

public class SingleNumberFinder {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR operation
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumberFinder finder = new SingleNumberFinder();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Single number is: " + finder.singleNumber(nums));
    }
}
