/* Length of the longest subarray with zero Sum
Problem Statement: Given an array containing both positive and negative integers, we have to find the length of the longest subarray with the sum of all elements equal to zero. */

import java.util.*;
public class Main
{
    public static int maxLen(int a[],int n){
        int maxi = 0, sum = 0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum == 0){
                maxi = i+1;
            }else{
                if(mpp.get(sum) != null){
                    maxi = Math.max(maxi,i-mpp.get(sum));
                }else{
                    mpp.put(sum,i);
                }
            }
        }
        return maxi;
    }
	public static void main(String[] args) {
		int[] a = {9,-3,3,-1,6,-5};
		int n = a.length;
		System.out.println("Length of longest subarray of sum 0 is: "+maxLen(a,n));
	}
}

// OUTPUT:  Length of longest subarray of sum 0 is: 5 
