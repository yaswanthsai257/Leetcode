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
        
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        
        ListNode leftpre=dummy;
        ListNode currnode=head;
        
        for(int i=0;i<left-1;i++){
            leftpre=leftpre.next;
            currnode=currnode.next;
            
        }
        
        ListNode sub=currnode;
        
        ListNode prenode=null;
        for(int j=0;j<=right-left;j++){
            ListNode nextnode=currnode.next;
            currnode.next=prenode;
            prenode=currnode;
            currnode=nextnode;
        }
        
        leftpre.next=prenode;
        sub.next=currnode;
        
        return dummy.next;
        
    }
}