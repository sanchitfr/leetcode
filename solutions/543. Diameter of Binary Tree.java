/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
​
class Solution {
    
    private int height(TreeNode root){
        if(root == null) return 0;
        
        return (1 + Math.max(height(root.left) , height(root.right)));
    }
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
//         if(root == null) return 0;
        
        
//         int leftDia = diameterOfBinaryTree(root.left);
//         int rightDia = diameterOfBinaryTree(root.right);
//         int height = height(root.left) + height(root.right);
        
//         return Math.max(height, Math.max(leftDia, rightDia));
        
        ans = 1;
        depth(root);
        return ans-1;
    }
    
    private int depth(TreeNode root){
        if(root == null) return 0;
        
        int L = depth(root.left);
        int R = depth(root.right);
        ans = Math.max(ans, L+R+1);
        return Math.max(L,R) + 1;
    }
}
