//This Approach is O(n)  

public class Solution {
    public int[] flip(String A) {

        int ones = 0, zeroes = 0;
        int L = 0, R = 0, maxsum = 0, sum = 0, start = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '1')
                ones++;
            else
                zeroes++;
        }

        if (ones == A.length()) {
            int arr[] = new int[0];
            return arr;
        } else {

            int A1[] = new int[A.length()];

            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) == '0') {
                    A1[i] = 1;
                } else {
                    A1[i] = -1;
                }
            }

            for (int i = 0; i < A1.length; i++) {
                sum = sum + A1[i];

                if (sum > maxsum) {
                    maxsum = sum;
                    start = L;
                    R = i;
                }

                if (sum < 0) {

                    sum = 0;
                    L = i + 1;
                }

            }

            int A2[] = new int[2];
            A2[0] = start + 1;
            A2[1] = R + 1;

            return A2;

        }

    }
}
