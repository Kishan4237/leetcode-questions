class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {

        int n = nums.size();

        unordered_set <int> st;

        for(auto num : nums){
            st.insert(num);
        }

        for(int i = 1; i <= nums.size() + 1; i++){

            if(st.find(i) == st.end()){
                return i;
            }
        }

        return n + 1;
        
    }
};