public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {

     int freq[]=new int[A.length+1];

     for(int num: A)
     {
         freq[num]++;
     }
     int missing=0,repeat=0;
     for(int i=1;i<freq.length;i++)
     {
         if(freq[i]==0)
         {
            missing=i;
         }

         if(freq[i]==2)
         {
             repeat=i;
         }
     }

     int res[]=new int[2];
     res[0]=repeat;
     res[1]=missing;

     return res;

    }
}




