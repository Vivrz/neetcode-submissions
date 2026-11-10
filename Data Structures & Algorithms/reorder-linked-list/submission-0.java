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
    public void reorderList(ListNode head) {
        Queue<ListNode> q = new LinkedList<>();
        Stack<ListNode> s = new Stack<>();
        ListNode curr = head;
        int sz = 0;
        while(curr != null){
            curr  = curr.next;
            sz++;
        }
        int y = sz/2;
        curr = head;
        while(y > 0){
            q.add(curr);
            curr = curr.next;
            y--;
        }
        while(curr != null){
            s.push(curr);
            curr = curr.next;
        }   
        ListNode c = new ListNode(0);
        while(!q.isEmpty() || !s.isEmpty()){
            if(!q.isEmpty()){
                c.next = q.poll();
                c = c.next;
            }
            if(!s.isEmpty()){
                c.next = s.pop();
                c = c.next;
            }
        }
        c.next = null;
    }
}
