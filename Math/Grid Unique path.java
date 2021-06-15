//Recursive Tree approach

public class Solution 
{
    
    public int uniquePaths(int A, int B)
    {
        
       return count1(0,0,A,B);
       
    }
    
    static int count1(int i,int j,int A,int B)
    {
        if(i==A-1 && j==B-1)
        return 1;
        else if(i>=A || j>=B)
        return 0;
        else
        return count1(i+1,j,A,B) + count1(i,j+1,A,B);
    }
    
    
}

