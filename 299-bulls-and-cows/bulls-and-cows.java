class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] freq = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s == g) {
                bulls++;
            } else {
                if (freq[s - '0'] < 0)
                    cows++;
                if (freq[g - '0'] > 0)
                    cows++;
                freq[s - '0']++;
                freq[g - '0']--;
            }
        }
        return bulls + "A" + cows + "B";
    }
}