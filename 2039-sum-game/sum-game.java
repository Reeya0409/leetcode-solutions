class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int diff = 0;
        int q1 = 0, q2 = 0;
        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?')
                q1++;
            else
                diff += num.charAt(i) - '0';
        }
        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?')
                q2++;
            else
                diff -= num.charAt(i) - '0';
        }
        if ((q1 + q2) % 2 == 1)
            return true;
        return diff != 9 * (q2 - q1) / 2;
    }
}