import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> resSet=new HashSet<>();
        for(int num : nums1) set.add(num);
        for(int num : nums2){
            if(set.contains(num)) resSet.add(num);
        }
        int[] res=new int[resSet.size()];
        int idx=0;
        for(int num : resSet) res[idx++]=num;
        return res;
    }
}