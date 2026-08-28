import java.util.*;

class Solution {
    public int leastBricks(List<List<Integer>> wall) {

        Map<Integer, Integer> map = new HashMap<>();

        int maxGap = 0;

        for (List<Integer> row : wall) {

            int sum = 0;

            // Last brick ko include nahi karna
            for (int i = 0; i < row.size() - 1; i++) {

                sum += row.get(i);

                map.put(sum, map.getOrDefault(sum, 0) + 1);

                maxGap = Math.max(maxGap, map.get(sum));
            }
        }

        return wall.size() - maxGap;
    }
}