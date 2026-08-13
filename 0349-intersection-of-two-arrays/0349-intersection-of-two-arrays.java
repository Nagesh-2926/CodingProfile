import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultset = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                resultset.add(num);
            }
        }
        int[] result = new int[resultset.size()];
        int index = 0;
        for (int num : resultset) {
            result[index++] = num;
        }

        return result;
    }
}