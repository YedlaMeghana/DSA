public class StaircaseMatrixSearch {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0, col = cols - 1;

        while (row < rows && col >= 0) {
            int current = matrix[row][col];

            if (current == target) {
                System.out.println("Element found at position: (" + row + ", " + col + ")");
                return true;
            } else if (current > target) {
                col--; // move left
            } else {
                row++; // move down
            }
        }

        System.out.println("Element not found.");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1,  4,  7, 11},
            {2,  5,  8, 12},
            {3,  6,  9, 16},
            {10,13, 14,17}
        };

        int target = 9;

        searchMatrix(matrix, target);
    }
}
//OUTPUT:
// Element found at position  (3,3)
