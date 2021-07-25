/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {

        ListNode dummy=new ListNode(-1);
        dummy.next=A;
        ListNode s=A;
        ListNode f=A;
        ListNode temp=new ListNode(-1);

        while(f!=null)
        {
            if(f.val==0)
            {
                temp.val=f.val;
                f.val=s.val;
                s.val=temp.val;
                f=f.next;
                s=s.next;
            }
            else
            {
                f=f.next;
            }
        }
        return dummy.next;
    }
}
