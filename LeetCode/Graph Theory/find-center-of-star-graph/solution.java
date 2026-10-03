class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length+1;
        int[] cnt=new int[n+1];
        for(int i=0;i<edges.length;i++){
            cnt[edges[i][0]]++;
            cnt[edges[i][1]]++;
        }
        for(int i=1;i<=n;i++){
            if(cnt[i]==edges.length) return i;
        }
        return -1;
    }
}