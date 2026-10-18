class Solution {
    static final long MOD = 1_000_000_007;
    long[] fact, invFact;
    
    public int numOfWays(int[] nums) {
        int n = nums.length;
        fact = new long[n + 1];
        invFact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++)
            fact[i] = fact[i - 1] * i % MOD;
        invFact[n] = pow(fact[n], MOD - 2);
        for (int i = n; i > 0; i--)
            invFact[i - 1] = invFact[i] * i % MOD;
        return (int) ((solve(nums) - 1 + MOD) % MOD);
    }
    long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = res * a % MOD;
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }
    long choose(int n, int k) {
        return fact[n] * invFact[k] % MOD * invFact[n - k] % MOD;
    }
    long solve(int[] a) {
        int n = a.length;
        if (n < 3) return 1;
        int root = a[0], l = 0, r = 0;
        for (int x : a) if (x < root) l++;
        int[] left = new int[l], right = new int[n - 1 - l];
        for (int i = 1; i < n; i++)
            if (a[i] < root) left[r++] = a[i];
            else right[i - 1 - r] = a[i];

        return choose(n - 1, l) * solve(left) % MOD * solve(right) % MOD;
    }
}
