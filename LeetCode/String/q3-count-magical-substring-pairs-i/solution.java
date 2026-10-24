class Solution {
    public int countMagicalPairs(String s) {
        int n=s.length();
        long ans=0;
        for(int i=0;i<n;i++){
            int[] lfreq=new int[27];
            int[] rfreq=new int[27];
            boolean[] lseen=new boolean[26];
            boolean[] rseen=new boolean[26];
            int lunique=0;
            int runique=0;
            for(int j=i;j>=0;j--){
                int idx=s.charAt(j)-'a';
                if(!lseen[idx]){
                    lseen[idx]=true;
                    lunique++;
                }
                lfreq[lunique]++;
            }
            for(int k=i+1;k<n;k++){
                int idx=s.charAt(k)-'a';
                if(!rseen[idx]){
                    rseen[idx]=true;
                    runique++;
                }
                rfreq[runique]++;
            }
            for(int l=0;l<=26;l++){
                ans+=(long)lfreq[l]*rfreq[l];
            }
        }
        return (int)ans;
    }
}