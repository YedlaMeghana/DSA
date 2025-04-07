public class MergeSort  {

    public static void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            // Sort first and second halves
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);

            // Merge the sorted halves
            merge(array, start, end);
        }
    }

    public static void merge(int a[], int si, int ei) {
        int mid = (si + ei) / 2;
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
             if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= ei) {
            temp[k++] = a[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            a[i] = temp[k];
        }
        
    }
    public static void printArray(int[] array) {
        for (int value : array)
            System.out.print(value + " ");
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] array = { 38, 27, 43, 3, 9, 82, 10 };
        System.out.println("Original array:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted array:");
        printArray(array);
    }
}
/*OUTPUT:
Original array:
16 27 15 3 9 8 10 
Sorted array:
3 8 9 10 15 16 27   

*/
