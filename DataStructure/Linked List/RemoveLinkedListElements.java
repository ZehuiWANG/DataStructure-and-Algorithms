//Remove Linked List Elements 
/*
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5

Credits:
Special thanks to @mithmatt for adding this problem and creating all test cases.
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode dummp=new ListNode(-1);
        ListNode p=dummp;
        dummp.next=head;
        while(p.next!=null){
            ListNode cur=p.next;
            if(cur.val==val){
                p.next=cur.next;//remove the node
            }else{
                p=cur;
            }
        }
        return dummp.next;
    }
}