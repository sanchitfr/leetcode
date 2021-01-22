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
    
//     private void kthSmallest(TreeNode root, List<Integer> list, int k){
//         if(root == null || list.size()>k) return;
        
//         kthSmallest(root.left, list, k);
//         list.add(root.val);
//         kthSmallest(root.right, list, k);
//         return;
//     }
    
    
    public int kthSmallest(TreeNode root, int k) {
        //return kthSmallest(root, k);
//         List<Integer> list = new ArrayList<>();
        
//         kthSmallest(root, list, k);
//         //if(k >= list.size()) return -1;
//         System.out.println(list.toString());
//         return list.get(k-1);
        LinkedList<TreeNode> list = new LinkedList<>();
        while(true){
            while(root != null){
                list.add(root);
                root = root.left;
            }
            root = list.removeLast();
            
            if(--k == 0) return root.val;
            root = root.right;
        }
    }
}
