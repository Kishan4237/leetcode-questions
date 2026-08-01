class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int digitCount = 0;

            while (n > 0) {
                digitCount++;
                n = n / 10;
            }

            if (digitCount % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }
}