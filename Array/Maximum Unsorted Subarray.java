// Time Complexity O(nlogn)

public class Solution {
    public int[] subUnsort(int[] A) {
        
        
        int n=A.length;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        
        int B[]=new int[n];
        
        for(int i=0;i<n;i++)
        B[i]=A[i];
        
        Arrays.sort(B);
        
        for(int i=0;i<n;i++)
        {
            if(A[i]!=B[i])
            {
                arr.add(i);
            }
        }
        
        if(arr.size()<2)
        {
            int ans[]=new int[1];
            ans[0]=-1;
            return ans;
        }
        else
        {
        
        int ans[]=new int[2];
        
        ans[0]=arr.get(0);
        ans[1]=arr.get(arr.size()-1);
        
        return ans;
        }
    }
    
}

