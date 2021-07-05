public class Solution {
    public String longestCommonPrefix(String[] A) {
        String min = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i].length() < min.length()) {
                min = A[i];
            }
        }

        int count = 0;

        for (int i = 0; i < min.length(); i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[j].charAt(i) == min.charAt(i)) {
                    continue;
                } else {
                    if (i == 0)
                        return "";
                    else
                        return min.substring(0, i);
                }
            }
        }
        return min;
    }

}
