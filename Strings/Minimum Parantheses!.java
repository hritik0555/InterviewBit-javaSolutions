public class Solution {
    public int solve(String A) {
        Stack<Character> stack = new Stack<Character>();
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == ')') {
                if (stack.empty()) {
                    count++;
                } else {
                    stack.pop();
                }

            } else {
                stack.push(A.charAt(i));
            }
        }

        return (count + stack.size());
    }
}
