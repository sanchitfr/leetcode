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
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//         if(t1 == null && t2 == null) return null;
//         TreeNode root = new TreeNode(rootData);
//         if(t1 == null){
//             t1 = new TreeNode();
//             t1.left = null;
//             t1.right = null;
//             root.val = t2.val;
//         } 
//         else if(t2 == null){
//           root.val = t1.val;
//             t2 = new TreeNode();
//             t2.left = null;
//             t2.right = null;
//         } 
//         else root.val = t1.val + t2.val;
        
        
//         root.left = mergeTrees(t1.left, t2.left);
//         root.right = mergeTrees(t1.right, t2.right);
        
//         return root;
        
        if(t1 == null) return t2;
        
        Stack<TreeNode[]> stack = new Stack<>();
