/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {

    ArrayList<Integer> ans=new ArrayList<Integer>();
    public int kthsmallest(TreeNode A, int B) {

      kthsmallestHelper(A,B);
      
      return ans.get(B-1);
    }

    public void kthsmallestHelper(TreeNode A,int B)
    {
        if(A==null)
        {
            return ;
        }


        kthsmallestHelper(A.left,B);
        ans.add(A.val);
        kthsmallestHelper(A.right,B);
    }
}
