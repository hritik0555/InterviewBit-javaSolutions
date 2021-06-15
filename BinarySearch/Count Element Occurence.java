public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int findCount(final int[] A, int B) {
        int first = BinarySearch(A, B, true);
        int second = BinarySearch(A, B, false);

        if (first == -1 || second == -1) {
            return 0;
        } else {
            return (second - first + 1);
        }
    }

    static int BinarySearch(int arr[], int x, boolean searchleft) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                result = mid;
                if (searchleft) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}
