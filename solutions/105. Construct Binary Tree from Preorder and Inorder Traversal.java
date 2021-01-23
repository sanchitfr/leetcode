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
    
    private TreeNode buildTree(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd){
        if(preStart > preorder.length - 1 || inStart > inEnd) return null;
        // if(start == end){
        //     if(inorder[start] != -1){
        //         return new TreeNode(inorder[start]);            
        //     }
        //     else return null;
        // }
        
        int rootData = preorder[preStart];
        TreeNode root = new TreeNode(rootData);
        int rootIndex = -1;
        for(int i = 0; i<inorder.length; i++){
            if(inorder[i] == rootData){
                rootIndex = i;
                break;
            } 
        }
        // inorder[rootIndex] = -1;
        root.left = buildTree(preorder, inorder, preStart+1, inStart, rootIndex-1);
        root.right = buildTree(preorder, inorder, preStart+rootIndex-inStart+1,  rootIndex+1, inEnd);
        
        return root;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder.length == 0) return null;
