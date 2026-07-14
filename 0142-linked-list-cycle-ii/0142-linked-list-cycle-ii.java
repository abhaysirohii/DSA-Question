/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length= 0;
        while(fast != null && fast.next!= null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode temp = slow;
                do{
                    temp= temp.next;
                    length++;
                }while(temp!=slow);
                break;
            }
        } 
        if(length==0){
        return null;
        }
        fast = head;
        slow = head;
        while(length>0){
            slow=slow.next;
            length--;
        }
        while(fast!=slow){
            fast= fast.next;
            slow=slow.next;
        }
        return slow;

    }
}