//  This Approach is O(n^3) where i am trying all posible pairs

public class Solution {
    public int solve(String[] A) {
        
        float B[]=new float[A.length];
        for(int i=0;i<A.length;i++)
        {
            B[i]=Float.parseFloat(A[i]);
        }
        
        
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B.length;j++)
            {
                for(int k=0;k<B.length;k++)
                {
                    if(k!=j && k!=i)
                    {
                        if(j!=i )
                        {
                            if(B[i]+B[j]+B[k]<2 && B[i]+B[j]+B[k]>1 )
                            {
                                return 1;
                            }
                            
                        }
                    }
                }
            }
        }
        return 0;
        
    }
}



// This code is more optimise and is O(n) where we have to check 5 cases

public class Solution {
    public int solve(String[] A) 
    {
        
    float arr[]=new float[A.length];
    
    for(int i=0;i<A.length;i++)
    {
        arr[i]=Float.parseFloat(A[i]);
    }
    
    
    ArrayList<Float> X=new ArrayList<Float>();
    ArrayList<Float> Y=new ArrayList<Float>();
    ArrayList<Float> Z=new ArrayList<Float>();
    
    
    for(int i=0;i<arr.length;i++)
    {
        
        if(0<arr[i] && arr[i]<(float)2/3)
        X.add(arr[i]);
        if((float)2/3<=arr[i] && arr[i]<=1)
        Y.add(arr[i]);
        if(1<arr[i] && arr[i]<2)
        Z.add(arr[i]);
        
    }
    
    
    Collections.sort(X,Collections.reverseOrder());
    Collections.sort(Y,Collections.reverseOrder());
    Collections.sort(Z,Collections.reverseOrder());
    
    
    
    
    //checking case A A A
    
    if(X.size()>=3)
    {
        if(X.get(0)+X.get(1)+X.get(2)>1)
        return 1;
    }
    
    
    //checking case A A B
    
    
    if(X.size()>=2 && Y.size()>=1)
    {
    
    float s=X.get(0)+X.get(1);
    for(int i=0;i<Y.size();i++)
    {
        if(Y.get(i)>(1-s) && Y.get(i)<(2-s))
        return 1;
    }
    
    }
    
    
    //checking case A A C
    
      if(X.size()>=2 && Z.size()>=1)
      {
        float s1=X.get(X.size()-1)+X.get(X.size()-2);
        
        for(int i=0;i<Z.size();i++)
        {
            if(Z.get(i)<(2-s1))
            return 1;
        }
          
      }
      
      
      // checking A B B
      
       if(X.size()>=1 && Y.size()>=2)
      {
        float s2=Y.get(Y.size()-1)+Y.get(Y.size()-2);
        
        
        for(int i=0;i<X.size();i++)
        {
            if(X.get(i)<2-s2)
            return 1;
        }
        
          
      }
      
      
      //checking case A B C 
      
       if(X.size()>=1 && Y.size()>=1)
      {
          if(Z.size()>=1)
          {
              if(X.get(X.size()-1)+Y.get(Y.size()-1)+Z.get(Z.size()-1)<2)
              return 1;
          }
      }
      
      
          return 0;
    

    
    }
}
