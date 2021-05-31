//I hava used merge sort to maintain the indices


public class Solution {
    
    static void mergesort(int arr[],int temp[],int low,int high,int index[],int index1[])
    {
        if(low!=high)
        {
            int mid=(low+high)/2;
            
            mergesort(arr,temp,low,mid,index,index1);
            mergesort(arr,temp,mid+1,high,index,index1);
            
            merge(arr,temp,low,mid,high,index,index1);
            
        }
    }
    
    static void merge(int arr[],int temp[],int low,int mid,int high,int index[],int index1[])
    {
        int start=low,i=low,j=mid+1;
        
        while(i<=mid && j<=high)
        {
            if(arr[j]<arr[i])
            {
                temp[start]=arr[j];
                index1[start]=index[j];
                j++;
            }
            else
            {
                temp[start]=arr[i];
                index1[start]=index[i];
                i++;
            }
            start++;
        }
        
        
        
        while(i<=mid)
        {
            temp[start]=arr[i];
            index1[start]=index[i];
            i++;
            start++;
            
        }
        
        while(j<=high)
        {
         temp[start]=arr[j];
         index1[start]=index[j];
         j++;
         start++;
        }
        
        for(int k=low;k<=high;k++)
        {
            arr[k]=temp[k];
        }
        
        for(int k=low;k<=high;k++)
        {
            index[k]=index1[k];
        }
        
    }
    
    
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        
        int N=A.length;
        
         int index[]=new int[N];
          int index1[]=new int[N];
          int temp[]=new int[N];
        
         for(int i=0;i<N;i++)
        index[i]=i;
   
       mergesort(A,temp,0,N-1,index,index1);
       
       
       int ans=Integer.MIN_VALUE;int maxindex=index[N-1];
       
       
       
       
       
       for(int i=N-2;i>=0;i--)
       {
           ans=Math.max(ans,maxindex-index[i]);
           maxindex=Math.max(maxindex,index[i]);
           
       }
       
       
       if(ans<0)
     return 0;
     else
     return ans;
       
       
        
    }
}
