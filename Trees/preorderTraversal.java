/* PREORDER TRAVERSAL
Complete the  function in the editor below, which has  parameter: a pointer to the root of a binary tree. 
It must print the values in the tree's preorder traversal as a single line of space-separated values.
Input Format
Our test code passes the root node of a binary tree to the preOrder function.
Output Format
Print the tree's preorder traversal as a single line of space-separated values.*/

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
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            root = insert(root, val);
        }
        preOrder(root);
        
        
    }
    public static void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
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
