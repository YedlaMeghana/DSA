import java.util.*;
public class BubbleSort
{
    public static void bubbleSort(int arr[]){
        for(int pass = 0; pass < arr.length;pass++){
            int swaps = 0;
            for(int j = 0;j < arr.length-pass-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0)
                break;
        }
        System.out.println("Array after sorting: ");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
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
        bubbleSort(arr);
	}
}

/* OUTPUT:
Enter the size of the array: 
5
Enter the elements of the array: 
4
6
2
5
1
Array after sorting: 
1 2 4 5 6 
*/
