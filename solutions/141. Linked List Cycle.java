/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.HashMap;
public class Solution {
    public boolean hasCycle(ListNode head) {
        // HashMap<ListNode, Boolean> nodes = new HashMap<>(); 
        // while(head != null){
        //     if(nodes.containsKey(head)) return true;
        //     nodes.put(head, true);
        //     head = head.next;
        // }
        // return false;
        if(head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(slow != fast){
            if(fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return true;
    }
}
