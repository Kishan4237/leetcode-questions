class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';
                        arr[index]++; 
        }
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            int index = ch - 'a';
            if(arr[index] == 1){
                return i;
            }
        }
        return -1;
    }
}