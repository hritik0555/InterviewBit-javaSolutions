public class Solution {
    public int largestRectangleArea(int[] A) {
     
     int rb[]=new int[A.length];

     Stack<Integer> stack=new Stack<Integer>();
     stack.push(A.length-1);
     rb[A.length-1]=A.length;

     for(int i=A.length-2;i>=0;i--)
     {
         while(stack.size()>0 && A[i] <= A[stack.peek()])
         {
             stack.pop();
         }

         if(stack.size()==0)
         {
             rb[i]=A.length;
         }
         else
         {
             rb[i]=stack.peek();
         }

         stack.push(i);
     }


     int lb[]=new int[A.length];

     stack=new Stack<Integer>();
     stack.push(0);
     lb[0]=-1;

     for(int i=1;i<A.length;i++)
     {
         while(stack.size()>0 && A[i] <= A[stack.peek()])
         {
             stack.pop();
         }

         if(stack.size()==0)
         {
             lb[i]=-1;
         }
         else
         {

             lb[i]=stack.peek();
         }

         stack.push(i);
     }

     int maxarea=0;

     for(int i=0;i<A.length;i++)
     {
         int width=rb[i]-lb[i]-1;
         int area=width*A[i];
         maxarea=Math.max(area,maxarea);
     }
     return maxarea;




    }
}
