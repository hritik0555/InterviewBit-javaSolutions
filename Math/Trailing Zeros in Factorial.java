public class Solution {
    public int trailingZeroes(int A) {
        int twos = 0, fives = 0;
        for (int i = 1; i <= A; i++) {
            int n = i;
            while (n % 2 == 0) {
                twos++;
                n = n / 2;

            }

            int m = i;
            while (m % 5 == 0) {
                fives++;
                m = m / 5;
            }
        }

        return Math.min(twos, fives);

    }
}

// Efficient Approach

public class Solution {
    public int trailingZeroes(int A) {

        int sum = 0;
        while (A > 0) {
            sum += A / 5;
            A = A / 5;
        }

        return sum;
    }
}
