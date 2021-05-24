//This Approach uses space complexity O(n)

// Because I have created an Array of same size as A i.e B 

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] A) {
        
        
        int B[]=new int[A.length];
        
        
        
        for(int i=0;i<A.length;i++)
        {
            if(B[A[i]-1]!=0)
            {
                return B[A[i]-1];
            }
            else
            {
                B[A[i]-1]=A[i];
            }
        }
        
        return -1;
        
    }
}


// Efficient Approach 

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] A) {
        
        for(int i=0;i<A.length;i++)
        {
            int x=Math.abs(A[i]);
            int x1=A[x];
            
            if(x1<0)  // It means x is already visited
            {
                return x;
            }
            else
            {
                A[x]=-x1;
            }
        }
        
        return -1;
    }
}