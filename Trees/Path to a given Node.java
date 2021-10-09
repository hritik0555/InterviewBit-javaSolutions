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

// Method -1 

public class Solution {
    public ArrayList<Integer> solve(TreeNode A, int B) {

       ArrayList<Integer> ans=solveHelper(A,B);
       
       int i=0,j=ans.size()-1;

       while(i<=j)
       {
           int temp=ans.get(j);
           ans.set(j,ans.get(i));
           ans.set(i,temp);
           i++;
           j--;
       }
       return ans;
    
    }

    public  ArrayList<Integer>  solveHelper(TreeNode A,int B)
    {

        if(A==null)
        {
            return new ArrayList<Integer>();
        }

        if(A.val==B)
        {
            ArrayList<Integer> bc=new ArrayList<Integer>();
            bc.add(A.val);
            return bc;
        }

        ArrayList<Integer> left=solveHelper(A.left,B);
        ArrayList<Integer> right=solveHelper(A.right,B);
        
        if(left.size()>0)
        {
            left.add(A.val);
            return left;
        }

        if(right.size()>0)
        {
            right.add(A.val);
            return right;
        }
       
           return new ArrayList<Integer>();
    }
}

// Efficient Method


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
    public ArrayList<Integer> solve(TreeNode A, int B) {
     
        ans.add(A.val);
        paths(A,B);
        return ans;
    
    }

    public boolean solveHelper(TreeNode A,int B)
    {
        if(A==null)
        {
            return false;
        }


        if(A.val==B)
        {
            return true;
        }

         boolean left=solveHelper(A.left,B);
         boolean right=solveHelper(A.right,B);
         if(left)
         {
             return true;
         }
         else if(right)
         {
             return true;
         }
         else 
         {
             return false;
         }
    }

    public void paths(TreeNode A,int B)
    { 
        

        if(solveHelper(A.left,B))
        {
            ans.add(A.left.val);
            paths(A.left,B);
         }
         else if(solveHelper(A.right,B))
         {
             ans.add(A.right.val);
             paths(A.right,B);
         }
    }
}
