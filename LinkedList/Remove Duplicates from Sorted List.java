/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A)
    {
      ListNode s=A;
      ListNode f=A;

      while(s.next!=null && f.next!=null)
      {
          if(f.next.val==s.val)
          {
              s.next=f.next.next;
          }
          else
          {
              s=s.next;
              f=f.next;
          }
      }

      return A;



    }
}
