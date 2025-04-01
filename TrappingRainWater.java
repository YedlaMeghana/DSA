import java.util.Scanner;
class TrappingRainWater {
    public static int trap(int[] height) {
        int waterLevel = 0;
        int totalWater = 0;
        int [] leftMax = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1;i < height.length;i++){
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }
        int [] rightMax = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i = (height.length)-2;i >= 0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        for(int i = 0;i < height.length;i++){
            waterLevel = Math.min(leftMax[i] ,rightMax[i] );
            totalWater += waterLevel - height[i];
        }

        return totalWater;
    }
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array:");
      int n = sc.nextInt();
      int height[] = new int[n];
      System.out.println("Enter the elements of the array:");
      for(int i = 0;i < n;i++){
          height[i] = sc.nextInt();
      }
      System.out.println("Total water that can be trapped is "+trap(height));
  }
}

/*OUTPUT:
Enter the size of the array:
7
Enter the elements of the array:
4
2
0
6
3
2
5
Total water that can be trapped is 11.
*/
