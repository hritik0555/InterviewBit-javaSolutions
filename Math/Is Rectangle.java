public class Solution {
    public int solve(int A, int B, int C, int D) {

        int arr[] = new int[4];

        arr[0] = A;
        arr[1] = B;
        arr[2] = C;
        arr[3] = D;

        Arrays.sort(arr);

        if (arr[0] == arr[1] && arr[2] == arr[3])
            return 1;
        else
            return 0;
    }
}
