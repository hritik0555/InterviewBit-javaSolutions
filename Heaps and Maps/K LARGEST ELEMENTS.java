public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        PriorityQueue<Integer> pq=new PriorityQueue();

        for(int i=0;i<A.size();i++)
        {
            int val=A.get(i);
            if(pq.size()<B)
            {
                pq.add(val);
            }
            else
            {
                if(val > pq.peek() )
                {
                    pq.remove();
                    pq.add(val);
                }
            }
        }

        ArrayList<Integer> res=new ArrayList<Integer>();
        while(pq.size()>0)
        {
            int v=pq.peek();
            pq.remove();
            res.add(v);
        }

        return res;
    }
}
