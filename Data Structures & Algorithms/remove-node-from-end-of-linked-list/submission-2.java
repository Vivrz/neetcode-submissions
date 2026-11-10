// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */

// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         if(head == null || head.next == null){
//             return null;
//         }
//         int sz = 0;
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         dummy = head;
//         ListNode curr = head;
//         while(curr != null){
//             curr = curr.next;
//             sz++;
//         }
//         int r = sz-n;
//         ListNode temp = head;
//         int i= 0;
//         while(i<r){
//             temp = temp.next;
//             i++;
//         }
//     temp.next = temp.next.next;
//     return dummy;
//     }
// }
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null||head.next == null){
            return null;
        }
        int sz = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }
        if(n>sz){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int idx = sz-n;
        int i =0;
        temp = dummy;
        while(i<idx){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return dummy.next;

    }
}
