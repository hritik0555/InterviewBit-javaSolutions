//lets have eg:  1 2 3 4 5 in sorted order

//Rotated the above array in circular manner then 5 1 2 3 4
//  One more time                                4 5 1 2 3
//                               Indexes:        0 1 2 3 4  
//One important property to note is that element next and previous to minimum element in array

//is greater than minimum element i.e 1<2 && 1 <5  

//In order to find how many times array is rotated we can simply say index of minimum element 

public class Solution {
    // DO NOT MODIFY THE LIST
    public int findMin(final List<Integer> a) {
        int low = 0, high = a.size() - 1;

        while (low <= high) {
            if (a.get(low) <= a.get(high)) {
                return a.get(low);
            }

            int mid = (low + high) / 2;
            int next = (mid + 1) % a.size();
            int prev = (mid - 1 + a.size()) % a.size();

            if (a.get(mid) < a.get(next) && a.get(mid) < a.get(prev)) {
                return a.get(mid);
            } else if (a.get(mid) < a.get(high)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
