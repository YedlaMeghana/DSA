/*Given an array of integers arr[] and an integer target.*/

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int  n = nums.length;
        Arrays.sort(nums);
        int temp[] = new int[2];
        temp[0]=temp[1]=-1;
        int left = 0 ,right = n-1;
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum > target){
                right--;
            }else if(sum == target){
                temp[0] = nums[left];
                temp[1] = nums[right];
                left++;right--;
            }else{
                left++;
            }
        }
        return temp;
    }
}
