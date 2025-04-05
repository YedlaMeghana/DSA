import java.util.*;
public class InsertionSort
{
    public static void insertionSort(int arr[]){
        for(int i = 1;i < arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
          // finding out correct position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
          //insertion
            arr[prev+1] = curr;
        }
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
                System.out.println("Enter the elements of the array: ");
                for(int i = 0;i < arr.length;i++){
                    arr[i] = sc.nextInt();
                }
                insertionSort(arr);
	}
}

/* OUTPUT:
Enter the size of the array: 
5
Enter the elements of the array: 
7
5
2
9
8
2 5 7 8 9 
*/
