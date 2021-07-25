/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;

        while(A!=null &&  B!=null)
        {
            if(A.val<=B.val)
            {
                ListNode temp=new ListNode(A.val);
                prev.next=temp;
                A=A.next;
            }
            else
            {
                ListNode temp=new ListNode(B.val);
                prev.next=temp;
                B=B.next;
            }
            prev=prev.next;
        }

        if(A!=null)
        {
            prev.next=A;
        }
        else
        {
            prev.next=B;
        }

        return dummy.next;
    }
}
