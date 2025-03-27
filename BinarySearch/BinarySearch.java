public class BinarySearch
{
    public static int binary(int nums[] , int key){
        int start  = 0 , end = nums.length-1;
        while(start < end){
            int mid = (start + end)/2;
            if(nums[mid] == key){
                return mid;
            }
            if(nums[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		int nums[] = {7,8,10,11,15,21,25,30};
		int key = 25;
		System.out.println(binary(nums,key));
	}
}
