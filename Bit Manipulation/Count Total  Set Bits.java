public class Solution {
    public int solve(int A) {
        if (A == 0) {
            return 0;
        }

        long x = maxpower2(A);
        long bitupto2raisex = ((1 << (x - 1)) * x) % 1000000007;
        long mostsignificant = (A - (1 << x) + 1) % 1000000007;
        long ans = bitupto2raisex + mostsignificant + solve(A - (1 << x)) % 1000000007;
        ans = ans % 1000000007;
        return (int) ans;
    }

    int maxpower2(int n) {
        int x = 0;
        while ((1 << x) <= n) {
            x++;
        }
        return x - 1;
    }
}
