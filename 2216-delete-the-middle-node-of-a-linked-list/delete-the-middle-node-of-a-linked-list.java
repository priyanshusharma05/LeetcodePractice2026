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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)return null;
        ListNode curr=head;
        int len=1;
        while(curr.next!=null){
            curr=curr.next;
            len++;
        }
        curr=head;
        int mid=(len/2)+1;
        int i=1;
        while(i<mid-1){
            curr=curr.next;
            i++;
        }
        if(curr.next.next==null){
            curr.next=null;
        }else{
        curr.next=curr.next.next;
        }
        return head;
    }
}