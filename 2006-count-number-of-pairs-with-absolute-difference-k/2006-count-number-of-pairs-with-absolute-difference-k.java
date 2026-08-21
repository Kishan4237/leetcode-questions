class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            if(!map.containsKey(ele)){
                map.put(ele,1);
            }
            else{
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
        }
        int pair = 0;
        for(int num : map.keySet()){
            int rem1 = num - k;
            int rem2 = num + k;
            if(map.containsKey(rem1)){
                 pair = pair+map.get(num)*map.get(rem1);
            }
            if(map.containsKey(rem2)){
                pair = pair+map.get(num)*map.get(rem2);
            }
        }
        pair = pair/2;
        return pair;
    }
}