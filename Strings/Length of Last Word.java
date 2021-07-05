public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        int count = 0;
        int n = A.length();
        for (int i = n - 1; i >= 0; i--) {
            if (A.charAt(i) == ' ') {
                if (count != 0)
                    return count;
            } else {
                count++;
            }
        }
        return count;
    }
}
