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
    int count=Integer.MAX_VALUE;
    public int minDepth(TreeNode A) {
        
        solveHelper(A,1);
        return count;

       

    }

    public void solveHelper(TreeNode A,int val)
    {
         if(A==null)
         {
              return;
         } 

         if(A.left==null && A.right==null)
         {
             count=Math.min(count,val);
         }

        solveHelper(A.left,val+1);
        solveHelper(A.right,val+1);
    }
}
