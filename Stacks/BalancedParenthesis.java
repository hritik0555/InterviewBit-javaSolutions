public class Solution {
    public int solve(String A)
    {
     Stack<Character> stack=new Stack<Character>();
       for(int i=0;i<A.length();i++)
       {
           if(A.charAt(i)=='(')
           {
             stack.push(A.charAt(i));
           }
           else
           {
               if(stack.empty())
               return 0;
               else
               stack.pop();
           }
       }
       if(stack.empty())
       return 1;
       else
       return 0;
    }
}
