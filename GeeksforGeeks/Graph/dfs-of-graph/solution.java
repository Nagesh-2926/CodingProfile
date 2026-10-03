class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int n=adj.size();
        boolean[] seen=new boolean[n];
        dfs(0,adj,seen,res);
        return res;
    }
    public void dfs(int curr,ArrayList<ArrayList<Integer>> adj,boolean[] seen,ArrayList<Integer> res){
        seen[curr]=true;
        res.add(curr);
        for(int node : adj.get(curr)){
            if(!seen[node]) dfs(node,adj,seen,res);
        }
    }
}