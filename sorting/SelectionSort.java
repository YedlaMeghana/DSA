import java.util.*;
public class SelectionSort
{
    public static void selectionSort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            int minPos = i;
            for(int j = i+1;j < arr.length;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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
  	    selectionSort(arr);
	}
}
/* OUTPUT:
Enter the size of the array: 
5
Enter the elements of the array: 
4
5
2
3
1
Array after sorting: 
1 2 3 4 5 
*/
