public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {

        int row[]=new int[a.size()];
        int col[]=new int[a.get(0).size()];

        for(int i=0;i<a.size();i++)
        {
            for(int j=0;j<a.get(i).size();j++)
            {
                if(a.get(i).get(j)==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<row.length;i++)
        {
            for(int j=0;j<col.length;j++)
            {
                if(row[i]==1 || col[j]==1)
                {
                    a.get(i).set(j,0);
                }
            }
        }
	}
}
