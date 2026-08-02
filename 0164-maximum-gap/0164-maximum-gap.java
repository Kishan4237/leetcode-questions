class Solution {
    public int maximumGap(int[] nums) {

        if (nums.length < 2) {
            return 0;
        }

        Arrays.sort(nums);

        int maxDifference = 0;

        for (int i = 1; i < nums.length; i++) {
            int difference = nums[i] - nums[i - 1];
            maxDifference = Math.max(maxDifference, difference);
        }

        return maxDifference;
    }
}