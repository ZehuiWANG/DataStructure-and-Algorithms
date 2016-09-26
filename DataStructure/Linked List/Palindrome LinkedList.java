/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        //find the mid list
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //find the sendon list
        ListNode secondHead = slow.next;
        ListNode p1 = secondHead;
        ListNode p2 = p1.next;
        slow.next = null;
        while(p1 != null && p2 != null){
            ListNode temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }
        //
        secondHead.next = null;
        while( p1 != null){
            if(head.val != p1.val){
                return false;
            }
            head = head.next;
            p1 = p1.next;
        }
        return true;
    }
}
