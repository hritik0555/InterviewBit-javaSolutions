public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K)

    {
        ArrayList<Integer> combine = new ArrayList<Integer>();/*
                                                               * This ArrayList is used here to store both the ArraList
                                                               * Elements arrival date and departure data
                                                               */

        HashMap<Integer, Integer> ar = new HashMap<Integer, Integer>();// To count the frequencies of arrival date
        HashMap<Integer, Integer> dp = new HashMap<Integer, Integer>();// To count the frequencies of departure date

        for (int i = 0; i < arrive.size(); i++) {
            if (ar.containsKey(arrive.get(i)))
                ar.put(arrive.get(i), ar.get(arrive.get(i)) + 1);
            else
                ar.put(arrive.get(i), 1);
            combine.add(arrive.get(i));// Adding Arrival elements
        }
        for (int i = 0; i < depart.size(); i++) {
            if (dp.containsKey(depart.get(i)))
                dp.put(depart.get(i), dp.get(depart.get(i)) + 1);
            else
                dp.put(depart.get(i), 1);

            combine.add(depart.get(i)); // Adding Departure elements
        }

        Collections.sort(combine); /*
                                    * Sorting the combine Arraylist so that we may traverse each element and can
                                    * easily determine how many rooms required
                                    */

        int count = 0;

        // This is for handling the situation when we have multiple arrival and
        // departure date
        for (int i = 0; i < combine.size(); i++) {
            int val = combine.get(i);
            if (ar.containsKey(val)) {
                if (ar.get(val) > 1 && dp.containsKey(val)) {
                    count = count + ar.get(val);
                    ar.put(val, 1);
                } else {
                    count = count + 1;
                }
            }
            if (dp.containsKey(val)) {
                if (dp.get(val) > 1 && ar.containsKey(val)) {
                    count = count - dp.get(val);
                    dp.put(val, 1);
                } else {
                    count = count - 1;
                }
            }

            if (count > K)// At any point if count i.e (guest) greater than available rooms
                return false;

        }
        return true;

    }
}



//Efficient  Algorithm:-


public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        
        Collections.sort(arrive);
        Collections.sort(depart);
        
        int rooms=0,i=0,j=0;
        
        while(i<arrive.size() && j<depart.size() && rooms<=K)
        {
            if(arrive.get(i)<depart.get(j)){
                i++;
                rooms++;
            }
            else
            {
                j++;
                rooms--;
            }
        }
        
        if(rooms<=K)
        return true;
        else
        return false;
    }
}
