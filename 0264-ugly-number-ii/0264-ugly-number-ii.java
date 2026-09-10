class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];

        ugly[0] = 1;

        int p2 = 0;
        int p3 = 0;
        int p5 = 0;

        for (int i = 1; i < n; i++) {

            int num2 = ugly[p2] * 2;
            int num3 = ugly[p3] * 3;
            int num5 = ugly[p5] * 5;

            ugly[i] = Math.min(num2, Math.min(num3, num5));

            if (ugly[i] == num2) {
                p2++;
            }

            if (ugly[i] == num3) {
                p3++;
            }

            if (ugly[i] == num5) {
                p5++;
            }
        }

        return ugly[n - 1];
    }
}