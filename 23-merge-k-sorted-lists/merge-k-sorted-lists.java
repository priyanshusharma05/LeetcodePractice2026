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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>( (a,b) -> a.val-b.val);
        if (lists == null || lists.length == 0) return null;
        for(ListNode head:lists){
            while(head!=null){
                pq.add(head);
                head=head.next;
            }
        }
        if (pq.isEmpty()) return null;
        ListNode head=new ListNode(pq.poll().val);
        ListNode c=head;
        while(!pq.isEmpty()){
            ListNode tem=new ListNode(pq.poll().val);
            c.next=tem;
            c=tem;
        }
        return head;
    }
}