class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

       
        int pro=1;

        for (int i = 0; i < n; i++) {
            left[i]=pro;
            pro*=nums[i];
        }
        pro=1;
        for (int i = n-1; i >=0; i--) {
            right[i]=pro;
            pro*=nums[i];
        }

       

       
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}