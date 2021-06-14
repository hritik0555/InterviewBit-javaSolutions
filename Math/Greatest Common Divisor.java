public class Solution {
    public int gcd(int A, int B) {

        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        if (A == 0 && B == 0) {
            return 0;
        } else if (A == 0 && B != 0) {
            return B;
        } else if (B == 0 && A != 0) {
            return A;
        } else {
            for (int i = 1; i <= Math.sqrt(A); i++) {
                if (A % i == 0) {
                    arr1.add(i);
                    if (i != Math.sqrt(A)) {
                        arr1.add(A / i);
                    }
                }
            }

            for (int i = 1; i <= Math.sqrt(B); i++) {
                if (B % i == 0) {
                    arr2.add(i);
                    if (i != Math.sqrt(B)) {
                        arr2.add(B / i);
                    }
                }
            }

            int gcd = 0;
            for (int i = 0; i < arr1.size(); i++) {
                int num = arr1.get(i);

                if (arr2.contains(num)) {
                    gcd = Math.max(gcd, num);
                }
            }

            return gcd;
        }

    }
}

// Euclid's Method

// GCD(A,B) = GCD(B,A%B) => recursive call

// GCD(A,0) = A

// GCD(0,B)= B

public class Solution {
    public int gcd(int A, int B) {

        while (A > 0 && B > 0) {
            int num = B;
            int num1 = A % B;

            A = num;
            B = num1;
        }

        if (A == 0)
            return B;
        else
            return A;

    }
}
