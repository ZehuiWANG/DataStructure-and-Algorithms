//Symmetric Tree
/**
    1
   / \
  2   2
 / \ / \
3  4 4  3
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
 
 //java version
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSymmetric(root.left,root.right);
    }
    public boolean isSymmetric(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null){
            return true;
        }if(root1!=null&root2==null){
            return false;
        }if(root1==null&&root2!=null){
            return false;
        }if(root1.val!=root2.val){
            return false;
        }
        return isSymmetric(root1.left,root2.right)&&isSymmetric(root1.right,root2.left);
    }   
}

//python version

# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return a boolean
     def isSymmetric(self, root):
        if root==None:
            return True
        return self.help(root.left,root.right);
     def help(self, p, q):
        if p == None and q == None: 
            return True
        if p and q and p.val == q.val:
            return self.help(p.left, q.right) and self.help(p.right, q.left)
        return False
 

    