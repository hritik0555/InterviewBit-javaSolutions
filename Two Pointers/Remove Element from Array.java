public class Solution {
    public int removeElement(ArrayList<Integer> a, int b) {

        int j = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) != b) {
                a.set(j, a.get(i));
                j++;
            }
        }
        return j;
    }
}
