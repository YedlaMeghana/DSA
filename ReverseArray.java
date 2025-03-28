//program to reverse an array 
import java.util.*;
public class ReverseArray
{
    public static void reverse(int nums[]){
        int first = 0;
        int last = nums.length - 1;
        while(first < last){
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }
        printArray(nums);
    }
    public static void printArray(int nums[]){
		System.out.println("The elements of the array after reversing: ");
        for(int i = 0;i<nums.length;i++){
		    System.out.print(nums[i]+" ");
		}
    }
	public static void main(String[] args) {
		System.out.println("Enter the size of the array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i = 0;i<n;i++){
		    nums[i] = sc.nextInt();
		}
	    reverse(nums);
	}
}
