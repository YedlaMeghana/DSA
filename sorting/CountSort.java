import java.util.*;
public class CountSort
{
    public static void countSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0;i < arr.length;i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i = 0;i < count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
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
        countSort(arr);
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
1 2 3 4 5  
*/
