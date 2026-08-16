class Solution {
    public int maxFreqSum(String s) {
        int n = s.length();
        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                int index = ch - 'a';
                arr[index]++;
            } else {
                int index1 = ch - 'a';
                arr[index1]++;
            }
        }
        int maxValue = Integer.MIN_VALUE;
        int maxValue1 = Integer.MIN_VALUE;

        for (int j = 0; j < arr.length; j++) {
            char ch1 = (char) (j + 'a');

            if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' ||
                    ch1 == 'o' || ch1 == 'u') {

                maxValue = Math.max(maxValue, arr[j]);
            } else {
                maxValue1 = Math.max(maxValue1, arr[j]);
            }

        }

        int m = maxValue + maxValue1;

        return m;
    }

}