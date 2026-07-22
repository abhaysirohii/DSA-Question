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
        if (head == null || left == right) return head;
        ListNode prev=null;
        ListNode current=head;
        for(int i=0;current!=null&&i<left-1;i++){
            prev=current;
            current=current.next;
        }
        ListNode start=prev;
        ListNode tail=current;
        prev=null;
        for(int i=0;current!=null&&(i<right-left+1);i++){
            ListNode next =current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        if(start!=null){
            start.next=prev;
        }else{
            head=prev;
        }
        if (tail != null) {
            tail.next = current;
        }
        return head;
    }
}