public class Solution {
    public int solve(int[] A, int B) {
        int j = -1;
        int ans = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                count++;
            }

            while (count > B) {
                j++;
                if (A[j] == 0)
                    count--;
            }

            ans = Math.max(ans, i - j);
        }

        return ans;
    }
}
