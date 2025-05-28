/* Count inversions in an array
Problem Statement: Given an array of N integers, count the inversion of the array (using merge-sort).
What is an inversion of an array? Definition: for all i & j < size of array, if i < j then you have to find pair (A[i],A[j]) such that A[j] < A[i].
Example 3:
Input Format: N = 5, array[] = {5,3,2,1,4}
Result: 7
Explanation: There are 7 pairs (5,1), (5,3), (5,2), (5,4),(3,2), (3,1), (2,1) and we have left 2 pairs (2,4) and (1,4) as both are not satisfy our condition. */

import java.util.*;
public class CountInversions
{
    public static int merge(int[] a ,int low , int mid , int high , int cnt){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right <= high){
            if(a[left] > a[right]){
                temp.add(a[right]);
                cnt =+ (mid-left+1);
                right++;
            }else{
                temp.add(a[left]);
                left++;
            }
        }
        while(left <= mid){
            temp.add(a[left]);
            left++;
        }
        while(right <= high){
            temp.add(a[right]);
            right++;
        }
        for(int i=low;i<= high;i++){
            a[i] = temp.get(i-low);
        }
        return cnt;
    }
    public static int mergeSort(int[] a , int low , int high){
        int cnt = 0;
        if(low < high){
            int mid = (low+high)/2;
            cnt += mergeSort(a,low,mid);//left part
            cnt += mergeSort(a,mid+1,high);//right part
            cnt += merge(a,low,mid,high ,cnt);
        }
        return cnt;
    }
    public static int numberOfInversions(int[] a , int n){
        int low = 0 ;
        int high = n-1;
        int cnt = mergeSort(a , low, n-1);
        return cnt;
    }
	public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        int n = 5;
        int cnt = numberOfInversions(a, n);
        System.out.println("The number of inversions are: " + cnt);
    }
}

// OUTPUT: The number of inversions are: 7
