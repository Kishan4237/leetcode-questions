class Solution {
public:
    bool canJump(vector<int>& nums) {

        int n = nums.size();

        int  maxJump = 0;
        int j = 0;

        for(int i = 0; i < nums.size(); i++){

            if(i > maxJump){
                return false;
            }

            j = i + nums[i];

            maxJump = max(maxJump, j);
        }

        return maxJump >= n-1;
        
    }
};