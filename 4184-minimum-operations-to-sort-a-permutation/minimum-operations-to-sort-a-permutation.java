class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int pos = 0;
        while (nums[pos] != 0) {
            pos++;
        }
        boolean valid = true;
        for (int i = 0; i < n; i++) {
            if (nums[(pos + i) % n] != i) {
                valid = false;
                break;
            }
        }
        if (valid) {
            return Math.min(pos, n - pos + 2);
        }
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = nums[n - 1 - i];
        }
        pos = 0;
        while (reversed[pos] != 0) {
            pos++;
        }
        for (int i = 0; i < n; i++) {
            if (reversed[(pos + i) % n] != i) {
                return -1;
            }
        }
        return 1 + Math.min(pos, n - pos);
    }
}
