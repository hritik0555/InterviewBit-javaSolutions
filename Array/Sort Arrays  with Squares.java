public class Solution {
    public int[] solve(int[] A) {

        int ans[]=new  int[A.length];
        int index=A.length-1;

        int l=0,h=A.length-1;

          while(l<=h)
          {
              int x=Math.abs(A[l]*A[l]);
              int y=Math.abs(A[h]*A[h]);

              if(x>=y){
                  ans[index]=x;
                  l++;
              }
              else
              {
                ans[index]=y;
                h--;
              }
              index--;
          } 

         
          return ans;       
    }
}