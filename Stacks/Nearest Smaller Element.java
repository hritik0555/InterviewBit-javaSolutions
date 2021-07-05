public class Solution {
    public int[] prevSmaller(int[] A) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);
        int G[] = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > stack.peek()) {
                G[i] = stack.peek();
                stack.push(A[i]);
            } else {
                while (stack.peek() >= A[i]) {
                    stack.pop();
                }
                G[i] = stack.peek();
                stack.push(A[i]);
            }
        }
        return G;
    }
}
