public class Solution {
    public int searchInsert(ArrayList<Integer> a, int b) {

        int low = 0, high = a.size() - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a.get(mid) == b) {
                return mid;
            } else if (a.get(mid) > b) {
                result = mid;
                high = mid - 1;
            } else {

                low = mid + 1;
                result = low;
            }

        }
        return result;
    }
}
