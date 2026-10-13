class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] squares = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(squares);
        long ans = 0;
        int n = nums.length;
        int k = (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            if (i < n - k) {
                ans -= squares[i];
            } else {
                ans += squares[i];
            }
        }
        return ans;
    }
}