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
        
        //calculate length
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        //initialise array to store first half of list
        int[] arr = new int[length/2];
        
        int i = 0;
        temp = head;
        while(i < length/2){
            arr[i] = temp.val;
            temp = temp.next;
            i++;
        }
        
        //if odd number of elements, no need to compare the middle element
        if(length%2 != 0) temp=temp.next;
        
        i--;
        //compare the second half of list element by element
        while(temp!= null){
            if(arr[i] != temp.val) return false;
            temp = temp.next;
            i--;
        }
        return true;
