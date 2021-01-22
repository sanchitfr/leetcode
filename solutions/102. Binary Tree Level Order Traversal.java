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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> pending = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        pending.add(root);
        while(!pending.isEmpty()){
            int size = pending.size();
            
            List<Integer> res = new ArrayList<>();
            
            for(int i = 0; i<size; i++){
                TreeNode front = pending.poll();
                res.add(front.val);
​
                if(front.left != null){
                    pending.add(front.left);
                }
                if(front.right != null){
                    pending.add(front.right);
                }
            }
            ans.add(res);    
        }
        return ans;
    }
}
