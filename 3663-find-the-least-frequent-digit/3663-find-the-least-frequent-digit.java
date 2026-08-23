

class Solution {
    public int getLeastFrequentDigit(int n) {

        HashMap<Integer, Integer> map = new HashMap<>();

        while (n > 0) {
            int digit = n % 10;

            map.put(digit, map.getOrDefault(digit, 0) + 1);

            n = n / 10;
        }

        int ans = 10;
        int minFreq = Integer.MAX_VALUE;

        for (int digit : map.keySet()) {

            int freq = map.get(digit);

            if (freq < minFreq) {
                minFreq = freq;
                ans = digit;
            }
            else if (freq == minFreq && digit < ans) {
                ans = digit;
            }
        }

        return ans;
    }
}