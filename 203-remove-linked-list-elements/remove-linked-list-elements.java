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
    public ListNode removeElements(ListNode head, int val) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }

        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int value:list){
            if(value!=val){
                curr.next=new ListNode(value);
                curr=curr.next;
            }
        }
        return dummy.next;
    }
}