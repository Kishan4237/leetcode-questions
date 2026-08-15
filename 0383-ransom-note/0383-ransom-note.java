class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] arr = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            int magazineIndex = ch - 'a';

            arr[magazineIndex]++;
        }

        for (int j = 0; j < ransomNote.length(); j++) {
            char ch = ransomNote.charAt(j);
            int ransomIndex = ch - 'a';

            if (arr[ransomIndex] == 0) {
                return false;
            }

            arr[ransomIndex]--;
        }

        return true;
    }
}