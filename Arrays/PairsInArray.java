// Program to print all the pairs in the array
import java.util.*;
public class PairsInArray
{
    public static void pairs(int nums[]){
        for(int i = 0;i < nums.length;i++){
            int curr = nums[i];
            for(int j = i+1;j < nums.length;j++){
                System.out.print("(" + curr +"," +nums[j] + ")");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter array elements: ");
		for(int i = 0;i < n;i++){
		    nums[i] = sc.nextInt();
		}
		pairs(nums);
	}
}

/* OUTPUT:
Enter the size of the array: 
5
Enter array elements: 
2
4
6
8
10

(2,4)(2,6)(2,8)(2,10)
(4,6)(4,8)(4,10)
(6,8)(6,10)
(8,10)

*/
