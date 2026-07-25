class Solution {
    public int missingNumber(int[] nums) {
     ArrayList<Integer> MissingNumber = new ArrayList<>();
     int n = nums.length;
     for(int num : nums){
        MissingNumber.add(num);
     }
     for(int i=0;i<n;i++){
        if(!MissingNumber.contains(i)){
            return  i;
        }
     }
     return  n;
    }
}