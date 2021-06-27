public class Solution {
    public void sortColors(ArrayList<Integer> a) {

        int m = 0, n = a.size() - 1, i = 0;

        while (i <= n) {
            if (a.get(i) == 0) {
                int temp = a.get(i);
                a.set(i, a.get(m));
                a.set(m, temp);
                m++;
                i++;

            }

            else if (a.get(i) == 1) {
                i++;
            }

            else {
                int temp = a.get(i);
                a.set(i, a.get(n));
                a.set(n, temp);
                n--;
            }
        }
    }
}
