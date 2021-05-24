public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        int X,Y;
        int steps=0;
        for(int i=0;i<A.size()-1;i++)
        {
            X=Math.abs((A.get(i+1)-A.get(i)));
            Y=Math.abs((B.get(i+1)-B.get(i)));
            
            steps=steps+Math.max(X,Y);
        }
        return steps;
    }
}
