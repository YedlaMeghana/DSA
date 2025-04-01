// Program to print the maxSum using kadane algorithm
import java.util.*;
public class Kadanes
{
    public static int kadanes(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0;i < nums.length;i++){
            if(currSum < 0){
                currSum = nums[i];
            }else{
                currSum = currSum + nums[i];
            }
            maxSum = Math.max(currSum , maxSum);
        }
        return maxSum;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i = 0;i < n;i++){
		    nums[i] = sc.nextInt();
		}
		int sum = kadanes(nums);
		System.out.println("The MaxSum is "+sum);
	}
}
