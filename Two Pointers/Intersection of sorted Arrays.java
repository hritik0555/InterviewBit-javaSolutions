public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] intersect(final int[] A, final int[] B) {
        int m = A.length;
        int n = B.length;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (A[i] < B[j]) {
                i++;
            } else if (A[i] > B[j]) {
                j++;
            } else {
                arr.add(A[i]);
                i++;
                j++;
            }
        }

        int ans[] = new int[arr.size()];
        for (i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }

        return ans;

    }
}
