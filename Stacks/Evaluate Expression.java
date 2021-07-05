public class Solution {
    public int evalRPN(ArrayList<String> A) {
        Stack<Integer> ans = new Stack<Integer>();
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i).equals("+") || A.get(i).equals("-") || A.get(i).equals("*") || A.get(i).equals("/")) {
                int value1 = ans.peek();
                ans.pop();
                int value2 = ans.peek();
                ans.pop();

                if (A.get(i).equals("+"))
                    ans.push(value2 + value1);
                else if (A.get(i).equals("-"))
                    ans.push(value2 - value1);
                else if (A.get(i).equals("*"))
                    ans.push(value2 * value1);
                else
                    ans.push(value2 / value1);
            } else {
                ans.push(Integer.parseInt(A.get(i)));
            }
        }
        return ans.peek();
    }
}
