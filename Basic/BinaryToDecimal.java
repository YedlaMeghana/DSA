// Program to convert a given binary number into decimal number.
import java.util.Scanner;
class BinaryToDecimal{
    public static void binaryToDecimal(int n){
        int pow = 0 ;
        double dec = 0;
        while(n > 0){
            int lastDigit = n % 10;
            dec = dec + (lastDigit * Math.pow(2,pow));
            pow++;
            n = n / 10;
        }
        System.out.println("The decimal value is :" +  dec);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n = sc.nextInt();
        binaryToDecimal(n);
    }
}
