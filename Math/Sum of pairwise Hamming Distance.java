public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int hammingDistance(final List<Integer> A) {
        int ans = 0;

        int n = A.size();

        for (int i = 0; i < 32; i++) {
            int ones = 0;
            for (int j = 0; j < n; j++) {
                int num = A.get(j);
                if ((num & 1 << i) != 0) {
                    ones = ones + 1;
                } else {
                    ones = ones + 0;
                }
            }

            int zeroes = n - ones;

            ans += (2L * ones * zeroes) % 1000000007;

            ans = ans % 1000000007;
        }

        return ans;

    }
}
