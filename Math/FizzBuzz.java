public class Solution {
    public ArrayList<String> fizzBuzz(int A) {

        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 1; i <= A; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr.add("FizzBuzz");
            } else if (i % 5 == 0) {
                arr.add("Buzz");
            } else if (i % 3 == 0) {
                arr.add("Fizz");
            } else {
                String a = Integer.toString(i);
                arr.add(a);
            }
        }

        return arr;
    }
}
