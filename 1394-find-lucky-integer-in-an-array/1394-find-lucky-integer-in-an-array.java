class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                int freq = map.get(num);
                map.put(num,freq+1);
            }
            else{
                map.put(num,1);
            }

        }
        int lucky = -1;
       for(int ele : map.keySet()){
        if(ele == map.get(ele)){
           lucky=Math.max(lucky,ele);

        }
       }
       return lucky;
    }
}