public class Solution {
    public int isPalindrome(int A) {

        int reverse = 0;
        int n = A;

        while (n > 0) {
            int div = n / 10;
            int rem = n % 10;

            reverse = rem + reverse * 10;

            n = div;
        }

        if (A < 0) {
            return 0;
        } else if (reverse == A) {
            return 1;
        } else {
            return 0;
        }

    }
}
