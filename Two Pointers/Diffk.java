public class Solution {
    public int diffPossible(int[] A, int B) {

        int i = 0, j = 1;

        while (j < A.length && i < A.length) {
            if (i == j) {
                j++;
            } else if (A[j] - A[i] > B) {
                i++;
            }

            else if (A[j] - A[i] < B) {
                j++;
            } else {
                return 1;
            }
        }
        return 0;
    }

}
