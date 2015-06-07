//Remove Nth Node From End of List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        
        ListNode fast=head;
        ListNode slow=head;
        
        while(n!=0){
            fast=fast.next;
            n--;
        }
        //when n equals the length of this linked list remove the first item;
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next=slow.next.next;
        return head;
    }
}