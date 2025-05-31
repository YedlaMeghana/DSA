/* Grid Unique Paths | Count paths from left-top to the right bottom of a matrix
Problem Statement: Given a matrix m X n, count paths from left-top to the right bottom of a matrix with the constraints that from each cell. 
You can either only move to the rightward direction or the downward direction. */

class GridUniquePaths {
    public int countPaths(int i,int j,int n, int m){
        if(i == (n-1) && j == (m-1)) return 1;
        if(i >= n || j >= m) return 0;
        return countPaths(i+1,j,n,m) + countPaths(i,j+1,n,m);
    }
    public int uniquePaths(int m, int n) {
        return countPaths(0,0,m,n);
    }
    public static void main(String args[]){
      // no of cols
      int n = 3;
      // no of rows
      int m=7;
      uniquePaths(m,n);
    }
}
// Output: 28
