class Solution {
    public boolean isBalanced(String num) {
        int n = num.length();
        // int [] arr = new int[n];
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            char ch = num.charAt(i);
            int index = ch - '0';
            if (i % 2 == 0) {
                sum += index;
            } else {
                sum1 += index;
            }

        }
        return sum == sum1;

    }
}