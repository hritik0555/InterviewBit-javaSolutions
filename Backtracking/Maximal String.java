public class Solution {
    static String ans;
    public String solve(String A, int B) {
        
        ans=A;
        findMaximal(A,B);
        return ans;

    }

    static void findMaximal(String A,int B)
    {
         if(Integer.parseInt(A)> Integer.parseInt(ans))
              {
                ans=A;  
              }
          
          if(B==0)
          {
              return;
          }

           for(int i=0;i<A.length()-1;i++)
           {
               for(int j=i+1;j<A.length();j++)
               {
                    if(A.charAt(j)>A.charAt(i))
                    {
                      String swapped= swap(A,i,j);
                      findMaximal(swapped,B-1); 
                    }
               }
           }

    }

    static String swap(String A,int i,int j)
    {
        char ith=A.charAt(i);
        char jth=A.charAt(j);

        String left=A.substring(0,i);
        String middle=A.substring(i+1,j);
        String right=A.substring(j+1);

        return left+jth+middle+ith+right;
    }
}
