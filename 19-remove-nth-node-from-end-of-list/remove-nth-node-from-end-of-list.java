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
        if(head.next==null)return null;
        int len=1;
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
            len++;
        }
        int idx=len-n; // prev of nth from last
        if(n==len)return head.next;
        ListNode prev=head;
        int i=1;
        while(i<idx){
            prev=prev.next;
            i++;
        }
        
        prev.next=prev.next.next;
        
        return head;
    }
}