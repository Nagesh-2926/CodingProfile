class Solution {
    public int countStaircase(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            Map<Integer,Integer> freq=new HashMap<>();
            Map<Integer,Integer> idx1=new HashMap<>();
            int unique=0;
            int waste=0;
            for(int j=i;j<n;j++){
                if(!freq.containsKey(nums[j])){
                    unique++;
                    freq.put(nums[j],1);
                    idx1.put(nums[j],unique);
                    if(1!=unique) waste++;
                }else{
                    int pos=idx1.get(nums[j]);
                    int oldfreq=freq.get(nums[j]);
                    if(oldfreq!=pos) waste--;
                    int newfreq=oldfreq+1;
                    freq.put(nums[j],newfreq);
                    if(newfreq!=pos) waste++;
                }
                if(waste==0) ans++;
            }
        }
        return ans;
    }
}