// Time complexity O(n)

//Think in the direction of sorting
//Didn't get?

// just sort the given Array and then swap the adjacent elements

//It will result in Wave form 


public class Solution {
    public int[] wave(int[] A) {
        
        Arrays.sort(A);
        int n=A.length;
        if(n%2==0)
        {
            for(int i=0;i<n;i=i+2)
            {
                int temp=A[i];
                A[i]=A[i+1];
                A[i+1]=temp;
            }
            return A;
        }
        else
        {
            for(int i=0;i<n-1;i=i+2)
            {
                int temp=A[i];
                A[i]=A[i+1];
                A[i+1]=temp;
            }
            return A;
        }
    }
}


