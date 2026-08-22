// Jvdroid-main: 
import java.util.*;

class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;

        // Case 1: k == 1
        if (k == 1) {

            HashMap<Integer, Integer> map = new HashMap<>();

            // Count frequency of every number
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            int max = -1;

            // Find largest number occurring exactly once
            for (int num : map.keySet()) {
                if (map.get(num) == 1) {
                    max = Math.max(max, num);
                }
            }

            return max;
        }

        // Case 2: k == n
        if (k == n) {

            int max = nums[0];

            for (int num : nums) {
                max = Math.max(max, num);
            }

            return max;
        }

        // Case 3: 1 < k < n

        int first = nums[0];
        int last = nums[n - 1];

        // Check whether first element occurs somewhere else
        boolean firstUnique = true;

        for (int i = 1; i < n; i++) {
            if (nums[i] == first) {
                firstUnique = false;
                break;
            }
        }

        // Check whether last element occurs somewhere else
        boolean lastUnique = true;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == last) {
                lastUnique = false;
                break;
            }
        }

        int max = -1;

        if (firstUnique) {
            max = Math.max(max, first);
        }

        if (lastUnique) {
            max = Math.max(max, last);
        }

        return max;
    }
}