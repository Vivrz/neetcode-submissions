/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        int sz = 0;
        
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            sz++;
        }
        if(n>sz){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int r = sz-n;
        int i= 0;
        ListNode temp = dummy;
        while(i<r){
            temp = temp.next;
            i++;
        }
    temp.next = temp.next.next;
    return dummy.next;
    }
}
