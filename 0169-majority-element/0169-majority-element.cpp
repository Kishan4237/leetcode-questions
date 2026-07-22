class Solution {
public:
    int majorityElement(vector<int>& nums) {

        int n = nums.size();

        unordered_map<int , int> mp;

        for(auto num : nums){
            mp[num] ++ ;
        }

        for(auto val : mp){

            if(val.second > n/2){ 
                return val.first; 
            }
        }

        return 0;
        
    }
};