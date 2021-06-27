public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        HashSet<Integer> ans = new HashSet<Integer>();

        for (int i = 0; i < A.size(); i++) {
            if (ans.contains(A.get(i) + B) || ans.contains(A.get(i) - B)) {
                return 1;
            } else {
                ans.add(A.get(i));
            }
        }

        return 0;
    }
}
