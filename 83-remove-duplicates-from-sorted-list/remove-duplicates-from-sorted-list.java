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
    public ListNode deleteDuplicates(ListNode head) {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        ListNode temp=head;
        while(temp!=null){
            set.add(temp.val);
            temp=temp.next;
        }
        
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int value:set){
            curr.next=new ListNode(value);
            curr=curr.next;
        }
        return dummy.next;
    }
}