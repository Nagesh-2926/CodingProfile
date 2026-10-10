class Solution{
    public long minSumSquareDiff(int[] nums1,int[] nums2,int k1,int k2){
        long[] freq=new long[100001];
        long sum=0;
        for(int i=0;i<nums1.length;i++){
            int diff=Math.abs(nums1[i]-nums2[i]);
            freq[diff]++;
            sum+=diff;
        }
        long k=(long)k1+k2;
        if(sum<=k) return 0;
        for(int i=100000;i>0;i--){
            if(freq[i]==0) continue;
            long need=Math.min(freq[i],k);
            freq[i]-=need;
            freq[i-1]+=need;
            k-=need;
            if(k==0)break;
        }
        long ans=0;
        for(int i=1;i<=100000;i++){
            ans+=freq[i]*i*i;
        }
        return ans;
    }
}