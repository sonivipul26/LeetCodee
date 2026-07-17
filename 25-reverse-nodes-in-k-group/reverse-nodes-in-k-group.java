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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;

        while(true){
            ListNode checker=prev;
            for(int i=0;i<k;i++){
                checker=checker.next;

                if(checker==null){
                    return dummy.next;
                }
            }
            ListNode group=prev.next;

            ListNode previous=null;
            ListNode curr=group;

            for(int i=0;i<k;i++){
                ListNode next=curr.next;
                curr.next=previous;
                previous=curr;
                curr=next;
            }

            prev.next=previous;
            group.next=curr;

            prev=group;


        }
    }
}