public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A)
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<A;i++)
        {
            ArrayList<Integer> temp=new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
            {
                if(j==i || j==0)
                {
                    temp.add(1);
                }
                else
                {
                    temp.add( (ans.get(i-1)).get(j-1) +  (ans.get(i-1)).get(j));
                }
            }
            ans.add(temp);
        }
        return ans;

    }
}
