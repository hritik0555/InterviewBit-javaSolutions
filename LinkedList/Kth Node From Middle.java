/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int solve(ListNode A, int B) 
    {
        ListNode temp=A;
         int index= Middle(A);

         if(index-B<0)
         {
             return -1;
         }
         else
         {
             for(int i=0;i<index-B;i++)
             {
                temp=temp.next;
             }
             return temp.val;
         }
    }
    public static int Middle(ListNode head)
    {

    ListNode s=head;
    ListNode f=head;
    int count=0;
    while(f.next!=null && f.next.next!=null)
    {
    

        s=s.next;
    f=f.next.next;
    count++;
      
    }
   
    if(f.next!=null)
    {
       if(f.next.next==null)
    {
       s=s.next;
       count++;
    }
    }
    
    
    return count;
}
}

