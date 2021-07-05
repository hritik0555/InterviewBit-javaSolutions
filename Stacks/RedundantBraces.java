public class Solution {
    public int braces(String A) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == ')') {
                if (stack.peek() == '(') {
                    return 1;
                } else {
                    int count = 0;
                    while (stack.peek() != '(') {
                        stack.pop();
                        count++;
                    }
                    if (count == 1)
                        return 1;
                    stack.pop();
                }
            } else {
                stack.push(A.charAt(i));
            }
        }
        return 0;

    }
}
