import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String, Integer> map = new HashMap<>();

        // Store list1 strings with their indexes
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        int minSum = Integer.MAX_VALUE;
        ArrayList<String> result = new ArrayList<>();

        // Traverse list2
        for (int j = 0; j < list2.length; j++) {

            String str = list2[j];

            if (map.containsKey(str)) {

                int sum = map.get(str) + j;

                if (sum < minSum) {
                    minSum = sum;
                    result.clear();
                    result.add(str);
                }
                else if (sum == minSum) {
                    result.add(str);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}