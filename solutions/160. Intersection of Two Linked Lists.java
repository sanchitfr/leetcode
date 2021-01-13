/**
 * Definition for singly-linked list.
 * public class ListNode {
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         HashMap<ListNode, Boolean> root = new HashMap<>();
//         while(headA != null){
//             root.put(headA, true);
//             headA = headA.next;
//         }
        
//         while(headB != null){
//             if(root.containsKey(headB)) return headB;
//             headB = headB.next;
//         }
//         return null;
        
        if(headA == null && headB == null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        while(a != b){
            a = a==null? headB : a.next;
            b = b==null? headA : b.next;
        }
        return a;
    }
}
