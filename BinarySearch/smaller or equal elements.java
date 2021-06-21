public class Solution {
    public int solve(int[] A, int B) {

        int low = 0, high = A.length - 1;

        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (A[mid] == B) {
                result = mid;

                low = mid + 1;
            }

            else if (A[mid] < B) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result + 1;

    }
}
