//Balanced Binary Tree

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(Math.abs(depth(root.left)-depth(root.right))>1){
            return false;
        }else{
            return isBalanced(root.right)&&isBalanced(root.left);
        }
    }
    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}