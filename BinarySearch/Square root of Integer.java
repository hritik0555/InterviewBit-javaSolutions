public class Solution {
    public int sqrt(int A) {

        if (A == 0) {
            return 0;
        }

        long low = 0, high = A - 1;
        long mid = 0, n = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            n = (mid + 1) * (mid + 1);
            if (n > A) {
                high = mid - 1;
            } else if (n == A) {
                return (int) mid + 1;
            } else {
                low = mid + 1;
            }

        }

        if (n > A) {
            return (int) mid;
        } else {
            return (int) mid + 1;
        }

    }
}
