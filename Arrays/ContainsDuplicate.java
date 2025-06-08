/* Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation: The element 1 occurs at the indices 0 and 3 */ 

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true; 
            }
            seen.add(num);
        }
        return false;
    }
   public static void main(String args[]){
     int[] nums = {1,3,2,1};
     System.out.println(containsDuplicate);
   }
}
