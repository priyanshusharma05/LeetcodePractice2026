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
        if(head==null)return head;
        int size=0;
        ListNode tem=head;
        while(tem!=null){
            tem=tem.next;
            size++;
        }
        int k=size-n+1;
        if(k==1){
            head=head.next;
            return head;
        }
        tem=head;
        int c=0;
        ListNode prev=null;
        while(tem!=null){
            c++;
            if(c==k){
                prev.next=tem.next;
                break;
            }
            prev=tem;
            tem=tem.next;
        }
        return head;
    }
}