// This Approach is O(nlogn) because any sorting algo will take this much 
//amount of time

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {

        int maxdiff = 0;

        if (A.length < 2) {
            return 0;
        } else {
            Arrays.sort(A);
            for (int i = 0; i < A.length - 1; i++) {
                maxdiff = Math.max(maxdiff, A[i + 1] - A[i]);
            }
            return maxdiff;
        }
    }
}

// Efficient Algorithm

// Time Complexity O(n)

/*
 * 
 * magic formula=(A[i]-min)/Interval
 * 
 * 
 * where magic formula will give index of bucket to store A[i]
 * 
 * How to calculate avg Interval ?
 * 
 * Interval=max-min/(n-1)
 * 
 * why (n-1)?
 * 
 * 
 * Think first ? Didn't get
 * 
 * Because let suppose if there are n elements then total gap between the
 * elements will be (n-1)
 * 
 * 
 */

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {

        int n = A.length;

        if (n < 2)
            return 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }

        float div = (float) (max - min) / (n - 1);
        int Interval = (int) Math.ceil(div);

        int BucketMax[] = new int[n - 1];
        int BucketMin[] = new int[n - 1];
        Arrays.fill(BucketMax, Integer.MIN_VALUE);
        Arrays.fill(BucketMin, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            if (A[i] == max || A[i] == min)
                continue;

            int index = (A[i] - min) / Interval;

            BucketMax[index] = Math.max(BucketMax[index], A[i]);
            BucketMin[index] = Math.min(BucketMin[index], A[i]);
        }

        int res = 0;

        for (int i = 0; i < BucketMax.length; i++) {
            if (BucketMin[i] != Integer.MAX_VALUE)
                res = Math.max(res, BucketMin[i] - min);
            if (BucketMax[i] != Integer.MIN_VALUE)
                min = BucketMax[i];

        }

        res = Math.max(res, max - min);

        return res;

    }
}
