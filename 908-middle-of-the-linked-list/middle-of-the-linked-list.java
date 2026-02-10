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
    public ListNode middleNode(ListNode head) {
        ListNode tem=head;
        int c=0;
        while(tem!=null){
            c++;
            tem=tem.next;
        }
        if(c==1)return head;
        tem=head;
        int m=(c/2) +1;
        int ct=1;
        while(tem!=null){
            if(ct==m){
                return tem;
            }
            ct++;
            tem=tem.next;
        }
        return null;
    }
}