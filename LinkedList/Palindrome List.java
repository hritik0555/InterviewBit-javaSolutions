/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {

    ListNode left=new ListNode(-1);
   public int lPalin(ListNode A)
   {
     
      left.next=A;
      left=left.next;
      int ans1=PalindromeHelper(A);
      if(ans1==1)
      {
          return 1;
      }
      else
      {
          return 0;
      }

   }
   public int PalindromeHelper(ListNode head)
   {
       if(head==null)
       {
           return 1;
       }
       int ans=PalindromeHelper(head.next);
       if(ans==0)
       {
           return 0;
       }
       else if(head.val!=left.val)
       {
           
           return 0;
       }
       else
       {
           left=left.next;
           return 1;
       }

   }
}

