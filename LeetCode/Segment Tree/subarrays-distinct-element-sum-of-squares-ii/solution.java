class Solution {
    static final int MOD = 1_000_000_007;
    public int sumCounts(int[] nums) {
        int n = nums.length;
        long[] sum = new long[4 * n];
        long[] sqsum = new long[4 * n];
        long[] lazy = new long[4 * n];
        int[] last = new int[n + 1];
        java.util.Arrays.fill(last, -1);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int l = last[x] + 1;
            update(1, 0, n - 1, l, i, sum, sqsum, lazy);
            ans = (ans + sqsum[1]) % MOD;
            last[x] = i;
        }
        return (int) ans;
    }

    private void update(int node, int low, int high, int l, int r, long[] sum, long[] sqsum, long[] lazy){
        if (r < low || high < l) return;
        if (l <= low && high <= r) {
            apply(node, low, high, sum, sqsum, lazy);
            return;
        }
        push(node, low, high, sum, sqsum, lazy);
        int mid = low + (high - low) / 2;
        update(node * 2, low, mid, l, r, sum, sqsum, lazy);
        update(node * 2 + 1, mid + 1, high, l, r, sum, sqsum, lazy);
        sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;
        sqsum[node] = (sqsum[node * 2] + sqsum[node * 2 + 1]) % MOD;
    }

    private void apply(int node, int low, int high, long[] sum, long[] sqsum, long[] lazy){
        long len = high - low + 1L;
        long oldSum = sum[node];
        sqsum[node] = (sqsum[node] + 2L * oldSum + len) % MOD;
        sum[node] = (oldSum + len) % MOD;
        lazy[node] = (lazy[node] + 1) % MOD;
    }

    private void push(int node, int low, int high, long[] sum, long[] sqsum, long[] lazy) {
        if (lazy[node] == 0 || low == high) return;
        int mid = low + (high - low) / 2;
        apply(node * 2, low, mid, sum, sqsum, lazy);
        apply(node * 2 + 1, mid + 1, high, sum, sqsum, lazy);
        lazy[node] = 0;
    }
}

class Solution {
    static final int MOD = 1_000_000_007;
    public int sumCounts(int[] nums) {
        int n = nums.length;
        long[] sum = new long[4 * n];
        long[] sqsum = new long[4 * n];
        long[] lazy = new long[4 * n];
        int[] last = new int[n + 1];
        java.util.Arrays.fill(last, -1);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int l = last[x] + 1;
            update(1, 0, n - 1, l, i, sum, sqsum, lazy);
            ans = (ans + sqsum[1]) % MOD;
            last[x] = i;
        }
        return (int) ans;
    }

    private void update(int node, int low, int high, int l, int r, long[] sum, long[] sqsum, long[] lazy){
        if (r < low || high < l) return;
        if (l <= low && high <= r) {
            apply(node, low, high, sum, sqsum, lazy);
            return;
        }
        push(node, low, high, sum, sqsum, lazy);
        int mid = low + (high - low) / 2;
        update(node * 2, low, mid, l, r, sum, sqsum, lazy);
        update(node * 2 + 1, mid + 1, high, l, r, sum, sqsum, lazy);
        sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;
        sqsum[node] = (sqsum[node * 2] + sqsum[node * 2 + 1]) % MOD;
    }

    private void apply(int node, int low, int high, long[] sum, long[] sqsum, long[] lazy){
        long len = high - low + 1L;
        long oldSum = sum[node];
        sqsum[node] = (sqsum[node] + 2L * oldSum + len) % MOD;
        sum[node] = (oldSum + len) % MOD;
        lazy[node] = (lazy[node] + 1) % MOD;
    }

    private void push(int node, int low, int high, long[] sum, long[] sqsum, long[] lazy) {
        if (lazy[node] == 0 || low == high) return;
        int mid = low + (high - low) / 2;
        apply(node * 2, low, mid, sum, sqsum, lazy);
        apply(node * 2 + 1, mid + 1, high, sum, sqsum, lazy);
        lazy[node] = 0;
    }
}