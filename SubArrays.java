// Program to print all the subarrays in a given array.
import java.util.*;
public class SubArrays
{
    public static void subArrays(int nums[]){
        for(int i = 0;i < nums.length;i++){
            for(int j = i;j < nums.length;j++){
                for(int k = i;k <= j;k++){
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n  = sc.nextInt();
		int nums[] = new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i = 0;i < n;i++){
		    nums[i] = sc.nextInt();
		}
		subArrays(nums);
	}
}

