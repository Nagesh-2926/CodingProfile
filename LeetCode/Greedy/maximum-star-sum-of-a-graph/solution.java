class Solution{
    public int maxStarSum(int[] vals,int[][] edges,int k){
        int n=vals.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] e:edges){
            adj.get(e[0]).add(vals[e[1]]);
            adj.get(e[1]).add(vals[e[0]]);
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ArrayList<Integer> list=adj.get(i);
            list.sort(Collections.reverseOrder());
            int sum=vals[i];
            int cnt=0;
            for(int x : list){
                if(cnt==k || x<=0) break;
                sum+=x;
                cnt++;
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}