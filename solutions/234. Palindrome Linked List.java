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
    public boolean isPalindrome(ListNode head) {
        int length = 0;
        
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        int[] arr = new int[length/2];
        
        int i = 0;
        temp = head;
        while(i < length/2){
            arr[i] = temp.val;
            temp = temp.next;
            i++;
        }
        
        if(length%2 != 0) temp=temp.next;
        i--;
        while(temp!= null){
            if(arr[i] != temp.val) return false;
            temp = temp.next;
            i--;
        }
        return true;
    }
}
