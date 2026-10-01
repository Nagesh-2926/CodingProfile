class Solution {
    public int numTrees(int n) {
        if(n<=1) return 1;
        int ans=0;
        for(int root=1;root<=n;root++){
            ans+=numTrees(root-1)*numTrees(n-root);
        }
        return ans;
    }
}