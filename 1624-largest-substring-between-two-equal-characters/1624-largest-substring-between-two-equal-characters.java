class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {

        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        int max = -1;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            int index = ch - 'a';

            if (arr[index] == -1) {
                arr[index] = i;
            } else {
                int length = i - arr[index] - 1;

                if (length > max) {
                    max = length;
                }
            }
        }

        return max;
    }
}