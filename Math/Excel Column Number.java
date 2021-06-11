public class Solution {
    public int titleToNumber(String A) {

        int n = A.length();
        int ans = 0;

        String s = "";

        for (int i = n - 1; i >= 0; i--)
            s = s + A.charAt(i);
        for (int i = 0; i < n; i++) {
            int value = ((int) s.charAt(i)) - 64;
            ans += (Math.pow(26, i) * value);
        }
        return ans;

    }
}
