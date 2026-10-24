class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n=nums.length;
        int waste=-1;
        long cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]<minK || nums[i]>maxK) waste=i;
            else cnt+=i-waste;
        }
        return cnt;
    }
}