/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode odd = null, even = null, oddTemp = null, evenTemp = null, temp = head;
        int count = 1;
        while(temp != null){
            if(count%2 == 0){
                if(even == null){
                    even = temp;
                    evenTemp = even;
                }
                else{
                    evenTemp.next = temp;
                    evenTemp = evenTemp.next;
                }
            }
            else{
                if(odd == null){
                    odd = temp;
                    oddTemp = odd;
                }
                else{
                    oddTemp.next = temp;
                    oddTemp = oddTemp.next;
                }
            }
            temp = temp.next;
            count++;
        }
        // System.out.println(oddTemp);
        oddTemp.next = even;
        if(evenTemp != null){
            evenTemp.next = null;        
        }
        return odd;
    }
}
