import java.util.HashMap;

class Solution {

    public static int lengthOfLongestSubstring(String s) {

    //     HashMap<Character, Integer> map = new HashMap<>();

    //     int left = 0;
    //     int maxLength = 0;

    //     for (int right = 0; right < s.length(); right++) {

    //         char ch = s.charAt(right);

    //         if (map.containsKey(ch) && map.get(ch) >= left) {
    //             left = map.get(ch) + 1;
    //         }

    //         map.put(ch, right);

    //         maxLength = Math.max(maxLength, right - left + 1);
    //     }

    //     return maxLength;
    // }

    // public static void main(String[] args) {

    //     String s = "abcabcbb";

    //     System.out.println(lengthOfLongestSubstring(s));


        HashSet<Character> set = new HashSet<>();

        int maxLength = 0;
        int i = 0;
        int j = 0;

        while (j < s.length()) {

            char ch = s.charAt(j);

            if (!set.contains(ch)) {
                set.add(ch);
                j++;

                int length = j - i;
                maxLength = Math.max(maxLength, length);
            }
            else {

                set.remove(s.charAt(i));
                i++;
            }
        }

        return maxLength;
    }
}
