/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> nodeMap = new HashMap<>();

        while(head != null){
            if(nodeMap.containsKey(head)) return true;
            else nodeMap.put(head, head.val);
            head = head.next;
        }
        return false;
    }
}