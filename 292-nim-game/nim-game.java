class Solution {
    public boolean canWinNim(int n) {
        return n%4!=0;
    }
}

// OR

// if (n <= 3) {
//             return true;
//         }
//         if (n % 4 == 0) {
//             return false;
//         }
//         return true;