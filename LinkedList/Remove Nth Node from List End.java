/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B)
    {
        int size=0;
        ListNode dummy=new ListNode(-1);
        dummy.next=A;
        ListNode prev=dummy;
        ListNode current=A;
        while(A!=null)
        {
            size++;
            A=A.next;
        }
        for(int i=1;i<=size-B;i++)
        {
          current=current.next;
          prev=prev.next;
        }
        prev.next=current.next;
        return dummy.next;
    }
}

