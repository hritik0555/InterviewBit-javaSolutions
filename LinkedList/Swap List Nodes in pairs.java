/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution 
{
public ListNode swapPairs(ListNode A) 
{
        
ListNode previous=new ListNode(-1);
previous.next=A;
ListNode current=A;
ListNode ans=previous;

while(current!=null  && current.next!=null)
{
    previous.next=current.next;
    current.next=current.next.next;
    previous.next.next=current;

    current=current.next;
    previous=previous.next.next;
}

return ans.next;

}
}

