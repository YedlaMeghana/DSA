/* POSTORDER TRAVERSAL
Complete the  function in the editor below. It received  parameter: a pointer to the root of a binary tree. 
It must print the values in the tree's postorder traversal as a single line of space-separated values.
Input Format
Our test code passes the root node of a binary tree to the  function.
Output Format
Print the tree's postorder traversal as a single line of space-separated values.
Sample Input

     1
      \
       2
        \
         5
        /  \
       3    6
        \
         4
Sample Output
4 3 6 5 2 1 */


import java.io.*;
import java.util.*;

public class Solution {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeNode root = null;
        for(int i = 0; i < n; i++){
            int val = sc.nextInt();
            root = insert(root, val);
        }
        postOrder(root); 
    }
    
    public static void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
    
    public static TreeNode insert(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }
        if(val <= root.val){
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
}
