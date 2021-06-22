public class Solution {
    public int numSetBits(long a) {

        int count = 0;
        while (a > 0) {
            long rem = a % 2;
            if (rem == 1) {
                count++;
            }
            a = a / 2;

        }
        return count;

    }
}
