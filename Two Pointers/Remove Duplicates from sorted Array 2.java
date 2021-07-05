public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        int i = 2, j = 2;

        if (a.size() == 2) {
            return 2;
        }

        if (a.size() == 1) {
            return 1;
        }

        while (i < a.size()) {
            if (a.get(i).intValue() != a.get(j - 2).intValue()) {
                a.set(j++, a.get(i++).intValue());
            } else {
                i++;
            }
        }
        return j;

    }
}
