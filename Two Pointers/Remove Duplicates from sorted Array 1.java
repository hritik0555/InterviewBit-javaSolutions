public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {

        int i = 0, j = 0;

        while (i < a.size()) {
            if (a.get(i).intValue() != a.get(j).intValue()) {
                j++;
                a.set(j, a.get(i).intValue());
            }
            i++;
        }
        return j + 1;

    }
}