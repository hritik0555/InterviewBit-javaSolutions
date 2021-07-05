public class Solution {
    public int solve(String A) {

        int vowel = 0, constants = 0;

        for (int i = 0; i < A.length(); i++) {
            if (Is_Vowel_Constant(A.charAt(i))) {
                vowel++;
            } else {
                constants++;
            }
        }

        int result = (vowel * constants) % 1000000007;
        return result % 1000000007;

    }

    static boolean Is_Vowel_Constant(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else {
            return false;
        }
    }
}
