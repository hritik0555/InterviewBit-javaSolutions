public class Solution {
    public String solve(String A, int B) {

      int i=0,j=0,count=0;

      

      while(i < A.length() && j < A.length())
      {
          if(A.charAt(i)==A.charAt(j))
          {
              count++;
              j++;
          }
          else
          {
              if(count==B)
              {
                  A=A.substring(0,i) + A.substring(j);
                   i=j;
                   i=i-B;
                   j=i;
                 
              }
              else{
                i=j;
              }
              
              count=0;
          }
      }

      if(count==B)
      {
          A=A.substring(0,i);
      }  
     return A;
    }
}
