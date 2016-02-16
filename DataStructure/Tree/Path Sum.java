//path Sum
//Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
/**
		      5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
*/

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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        if(root.left==null&root.right==null){
            return root.val==sum;
        }else{
            sum=sum-root.val;
        }
        return hasPathSum(root.left,sum)||hasPathSum(root.right,sum);
    }
}