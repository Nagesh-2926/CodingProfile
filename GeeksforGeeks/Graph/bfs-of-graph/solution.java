class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> res=new ArrayList<>();
        int n=adj.size();
        boolean[] seen=new boolean[n];
        bfs(0,q,adj,seen,res);
        return res;
    }
    public void bfs(int curr,Queue<Integer> q,ArrayList<ArrayList<Integer>> adj,boolean[] seen,ArrayList<Integer> res){
        q.add(curr);
        seen[curr]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            res.add(node);
            for(int neighbour : adj.get(node)){
                if(!seen[neighbour]){
                    seen[neighbour]=true;
                    q.add(neighbour);
                }
            }
        }
    }
}