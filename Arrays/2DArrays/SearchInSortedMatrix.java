import java.util.*;
public class Main
{
    public static boolean keySearch(int matrix[][] , int key){
       for(int i = 0;i < matrix.length;i++){
           for(int j = 0;j < matrix.length;j++){
               if(matrix[i][j] == key){
                   System.out.println("Found at ("+i+j+")");
                   return true;
               }
           }
       }
       System.out.println("Element not found!");
       return false;
    }
	public static void main(String[] args) {
		 int matrix[][] = {
            {1, 5, 8, 9},
            {12,14,17,19},
            {21,24,25,27},
            {30,33,35,39}
        };
        System.out.println(keySearch(matrix,27));
	}
}

//OUTPUT :
// Found at (23)
// true
