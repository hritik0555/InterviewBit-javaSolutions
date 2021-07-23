/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */

public class Solution {
   
    public ListNode addTwoNumbers(ListNode A, ListNode B)
    {
      ListNode head=new ListNode(-1);
      ListNode tail=head;  
      ListNode one=A;
      ListNode two=B;
      int oc=0,data=0;
      int nd=0;
      while(one!=null && two!=null)
      {
         data=one.val+two.val+oc;
          nd=data%10;
           
           tail.next=new ListNode(nd);
           tail=tail.next;
         oc=data/10;

         one=one.next;
         two=two.next;
      }

      while(one!=null)
      {
         data=one.val+oc;
          nd=data%10;
          tail.next=new ListNode(nd);
           tail=tail.next;
          oc=data/10;
          one=one.next;
      }

      while(two!=null)
      {
          data=two.val+oc;
          nd=data%10;
          tail.next=new ListNode(nd);
           tail=tail.next;
          oc=data/10;
          two=two.next;

      }

      if(oc>0)
      {
         tail.next=new ListNode(oc);
           tail=tail.next;
      }


     
     
      return head.next;
    }

    
}

