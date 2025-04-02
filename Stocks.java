// PROGRAM TO FIND THE MAX PROFIT FROM THE ARRAY OF STOCKS
import java.util.*;
public class Stocks
{
    public static void stocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0;i < prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit , profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        System.out.println("Maximum profit that can be achieved is "+maxProfit);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
        int prices[] = new int[n];
		System.out.println("Enter the stock values:");
		for(int i = 0;i < n;i++){
		    prices[i] = sc.nextInt();
		}
        stocks(prices);
	}
}
/*OUTPUT:
Enter the size of the array:
6
Enter the stock values:
7
1
3
5
4
6
Maximum profit that can be achieved is 5.

*/
