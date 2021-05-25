// Time complexity O(n)
//This solution is based on the approach that:-
//first sort the array
//trace elements one by one 
//if suppose we subtract index of current traced element from the last index of Array then 
//we will get total number of elements that are greater than or equal to current traced element

//Think take your time !

public class Solution {
    public int solve(int[] A) {

        Arrays.sort(A);
        int i;
        int index = -1;
        for (i = 0; i < A.length; i++) {

            if (A[i] == (A.length - 1 - i)) {
                index = i;
                break;
            }
        }

        if (index != -1) // This is beacuse I am checking that elements are really greater or just equal.
        {
            int count = 0;

            for (int j = index + 1; j <= A.length - 1; j++) {
                if (A[j] > A[index])
                    count++;
            }

            if (count == A[index])
                return 1;

        }

        return -1;
    }
}

// Efficient Approach
// In this method I am ignoring the duplicate element

public class Solution {
    public int solve(int[] A) {

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            while (i < A.length - 1 && A[i] == A[i + 1])
                i++;

            if (A[i] == (A.length - 1 - i))
                return 1;
        }

        return -1;

    }
}
