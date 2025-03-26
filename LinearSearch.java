public class LinearSearch{
    public static int linearsearch(int nums[] , int key){
        for(int i = 0;i < nums.length; i++){
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {5,7,4,3,9,2,8,10,8,12,16};
        int key = 8;
        int idx = linearsearch(nums , key);
        if(idx ==  -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+idx);
        }
    }
}
