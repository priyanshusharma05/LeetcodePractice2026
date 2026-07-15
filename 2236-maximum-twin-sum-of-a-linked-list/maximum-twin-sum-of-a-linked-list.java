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
    public int pairSum(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        int c=1;
        ListNode tem=head;
        while(tem.next!=null){
            tem=tem.next;
            c++;
        }
        tem=head;
        int i=1;
        while(i<=c/2){
            st.push(tem);
            tem=tem.next;
            i++;
        }
        int max=Integer.MIN_VALUE;
        while(tem!=null){
            int o1=tem.val;
            int o2=st.pop().val;
            max=Math.max(max,(o1+o2));
            tem=tem.next;
        }
        return max;
    }
}