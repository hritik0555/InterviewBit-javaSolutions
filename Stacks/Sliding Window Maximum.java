public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] slidingMaximum(final int[] A, int B) {

       ArrayList<Integer> arr=new ArrayList<Integer>();
       

       int nge[]=new int[A.length];

       Stack<Integer> stack=new Stack<>();

       stack.push(A.length-1);

       nge[A.length-1]=A.length;

       for(int i=A.length-2;i>=0;i--)
       {
           while(stack.size() > 0 && A[i] >=  A[stack.peek()] )
           {
               stack.pop();
           }

           if(stack.size()==0)
           {
               nge[i]=A.length;
           }
           else
           {
               nge[i]=stack.peek();
           }

           stack.push(i);
       }


       for(int i=0;i<=A.length-B;i++)
       {
             int j=i;
             while(nge[j] < i+B)
             {
                 j=nge[j];
             }

             arr.add(A[j]);
       }
       
       int ans[]=new int[arr.size()];
       for(int i=0;i<arr.size();i++)
       {
          ans[i]=arr.get(i);
       }
       return ans;
 


    }
}
