class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1_000_000_007;
        long[] dp = new long[s.length() + 1];
        
        dp[0] = 1;
        
        int[] last = new int[26];
        
        for (int i = 1; i <= s.length(); i++) {
            char ch = s.charAt(i - 1);
            int index = ch - 'a';
            
            dp[i] = (2 * dp[i - 1]) % MOD;
            
            if (last[index] > 0) {
                dp[i] = (dp[i] - dp[last[index] - 1] + MOD) % MOD;
            }
            
            last[index] = i;
        }

        return (int) ((dp[s.length()] - 1 + MOD) % MOD);
    }
}