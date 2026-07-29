class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int jumpMax = 0;
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(i > jumpMax){
                return false;
            }
            j = i+nums[i];
            jumpMax = Math.max(jumpMax,j);
        }
        return jumpMax >= n-1;
        
    }
}