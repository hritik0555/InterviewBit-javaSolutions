//Sieve of Eratosthenes Approach

public class Solution {
    public ArrayList<Integer> primesum(int A) {

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        int primes[] = new int[A + 1];

        for (int i = 0; i <= A; i++) {
            primes[i] = 1;
        }

        primes[0] = 0;
        primes[1] = 0;

        for (int i = 2; i <= Math.sqrt(A); i++) {
            for (int j = 2; j * i <= A; j++) {
                primes[i * j] = 0;
            }
        }

        for (int i = 0; i < primes.length; i++) {
            if (primes[i] != 0) {
                arr.add(i);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.contains(A - arr.get(i))) {
                arr1.add(arr.get(i));
                arr1.add(A - arr.get(i));
                break;
            }
        }

        return arr1;

    }
}
