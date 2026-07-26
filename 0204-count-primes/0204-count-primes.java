class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];

        // all element is prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // marks the non-prime of the multiples
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        //count the prime number
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}