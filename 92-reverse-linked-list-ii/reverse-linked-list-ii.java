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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right)return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevLeft = dummy;
        int j = 1;
        while (j < left) {
            prevLeft = prevLeft.next;
            j++;
        }
        ListNode curr = prevLeft.next; 
        ListNode st = reverseList(curr, right - left + 1);
        prevLeft.next = st;
        return dummy.next;
    }
    public ListNode reverseList(ListNode head,int ri) {
        ListNode prev=null;
        ListNode curr=head;
        int i=1;
        while(curr!=null && i<=ri){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            i++;
        }
        head.next = curr;
        return prev;
    }
}