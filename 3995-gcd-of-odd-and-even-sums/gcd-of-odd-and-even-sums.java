class Solution {
    static int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    } 
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        int sumEven=0;
        for(int i=1;i<=n;i++){
            sumOdd+= (i*2)-1;
            sumEven+= i*2;
        }
    return gcd(sumOdd,sumEven);
    }
}

// or 

// class Solution {
//         public int gcdOfOddEvenSums(int n) {
//             return n;
//         }
//     }
