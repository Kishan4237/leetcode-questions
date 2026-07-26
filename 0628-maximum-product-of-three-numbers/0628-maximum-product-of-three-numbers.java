class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);

        int n = nums.length;
       int MaxProduct1 = nums[n-1]*nums[n-2]*nums[n-3];
       int MaxProduct2 = nums[0]*nums[1]*nums[n-1];
       int MaxProduct = Math.max(MaxProduct1,MaxProduct2);
       return MaxProduct;
        }
}