// Program to convert a given decimal number into its equivalent binary number.
import java.util.*;
public class DecimalToBinary
{
    public static int decimalToBinary(int n){
        int pow = 0;
        int binNum = 0;
        while(n > 0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        return binNum;
    }
	public static void main(String[] args) {
		System.out.println("Enter the value:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = decimalToBinary(n);
		System.out.println("The Binary value for the given decimal value is " + ans);
	}
}
