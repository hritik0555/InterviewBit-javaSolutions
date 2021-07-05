public class Solution {
    public int isPalindrome(String A) {
        int i = 0;
        int j = A.length() - 1;

        A = A.toLowerCase();
        while (i <= j) {
            if (IsNumeric(A.charAt(i)) || IsAlpha(A.charAt(i))) {
                if (IsNumeric(A.charAt(j)) || IsAlpha(A.charAt(j))) {
                    if (A.charAt(i) == A.charAt(j)) {
                        i++;
                        j--;
                    } else {
                        return 0;
                    }
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        return 1;
    }

    static boolean IsNumeric(char input) {
        if (input >= 48 && input <= 57) {
            return true;
        } else {
            return false;
        }

    }

    static boolean IsAlpha(char input) {
        if (input >= 97 && input <= 122) {
            return true;
        } else {
            return false;
        }

    }
}
