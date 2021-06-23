public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int n = A.length;
        int count[] = new int[32];
        for (int j = 0; j < n; j++) {
            int a = A[j];
            for (int i = 0; i < 32; i++) {
                int value = a & 1;
                if (value == 1) {
                    count[i]++;
                }
                a = a >> 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            count[i] = count[i] % 3;
            ans = ans + ((int) Math.pow(2, i)) * count[i];
        }
        return ans;
    }
}
