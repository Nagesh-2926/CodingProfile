class Solution {
    public long maximizeSum(int[] nums, int k) {
        long sum=0;
        long[] best=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            int max=change(nums[i]);
            sum+=nums[i];
            best[i]=(long)max-nums[i];
        }
        Arrays.sort(best);
        for(int i=best.length-1;i>=0 && k>0;i--,k--){
            sum+=best[i];
        }
        return sum;
    }
    private int change(int num){
        char[] digit=String.valueOf(num).toCharArray();
        Arrays.sort(digit);
        int res=0;
        for(int i=digit.length-1;i>=0;i--){
            res=res*10+(digit[i]-'0');
        }
        return res;
    }
}©leetcode