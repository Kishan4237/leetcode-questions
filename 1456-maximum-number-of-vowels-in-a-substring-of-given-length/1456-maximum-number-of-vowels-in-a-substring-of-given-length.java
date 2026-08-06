class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;

        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        int maxVowel = count;

        for (int i = k; i < s.length(); i++) {

            char left = s.charAt(i - k);
            char right = s.charAt(i);

            if (left == 'a' || left == 'e' || left == 'i' || left == 'o' || left == 'u') {
                count--;
            }

            if (right == 'a' || right == 'e' || right == 'i' || right == 'o' || right == 'u') {
                count++;
            }

            maxVowel = Math.max(maxVowel, count);
        }

        return maxVowel;
    }
}