/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode A, int B)
    { 
        ListNode small=new ListNode(-1);
        ListNode tailS=small;
        ListNode large =new ListNode(-1);
        ListNode tailL=large;

        while(A!=null)
        {
            if(A.val<B)
            {
                ListNode temp=new ListNode(A.val);
                tailS.next=temp;
                tailS=tailS.next;
            }
            else
            {
                ListNode temp=new ListNode(A.val);
                tailL.next=temp;
                tailL=tailL.next;
            }
            A=A.next;
        }

        tailS.next=large.next;
        return small.next;
    }
}

