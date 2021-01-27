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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        TreeNode nullNode = null;
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(nullNode);
        int count = 1;
        List<String> row = new ArrayList<>();
        while(!pendingNodes.isEmpty()){
            TreeNode front = pendingNodes.poll();
            if(front == nullNode && row.size() != 0){
                pendingNodes.add(nullNode);
                List<Integer> res = new ArrayList<>();
                
                if(count%2 != 0){
                    for(int i = 0; i<row.size(); i++){
                        res.add(Integer.parseInt(row.get(i)));
                    }
                }
                else{
                    for(int i = row.size()-1; i>=0; i--){
                        res.add(Integer.parseInt(row.get(i)));
                    }
                }
                ans.add(res);
                count++;
